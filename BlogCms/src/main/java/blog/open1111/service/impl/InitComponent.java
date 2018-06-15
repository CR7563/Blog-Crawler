package blog.open1111.service.impl;


import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import blog.open1111.entity.ArcType;
import blog.open1111.entity.Article;
import blog.open1111.entity.Link;
import blog.open1111.service.ArcTypeService;
import blog.open1111.service.ArticleService;
import blog.open1111.service.LinkService;


/**
 * ��ʼ����� 
 * @author java1234_С��
 *
 */
@Component("initComponent")
public class InitComponent implements ServletContextListener,ApplicationContextAware{

	private static ApplicationContext applicationContext;
	
	public void refreshSystem(ServletContext application){
		ArcTypeService arcTypeService=(ArcTypeService) applicationContext.getBean("arcTypeService");
		List<ArcType> arcTypeList=arcTypeService.list(null); // ��ѯ������������
		application.setAttribute("arcTypeList", arcTypeList); 
		
		LinkService linkService=(LinkService) applicationContext.getBean("linkService");
		List<Link> linkList=linkService.list(null); // ��ѯ������������
		application.setAttribute("linkList", linkList);
		
		ArticleService articleService=(ArticleService) applicationContext.getBean("articleService");
		List<Article> hotArticleList=articleService.getHot(); // ��ȡ��������
		application.setAttribute("hotArticleList", hotArticleList);
	}
	
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext application=servletContextEvent.getServletContext();
		refreshSystem(application);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
}
