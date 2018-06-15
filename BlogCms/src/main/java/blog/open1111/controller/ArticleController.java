package blog.open1111.controller;


import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import blog.open1111.entity.Article;
import blog.open1111.service.ArticleService;
import blog.open1111.util.StringUtil;

/**
 * ����Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

	@Resource
	private ArticleService articleService;
	
	/**
	 * ����������ϸ��Ϣ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{id}")
	public ModelAndView details(@PathVariable("id") Integer id,HttpServletRequest request)throws Exception{
		ModelAndView mav=new ModelAndView();
		Article article=articleService.findById(id);
		article.setClickHit(article.getClickHit()+1); // ���ӵ������+1
		articleService.update(article);
		String tags=article.getTags();
		if(StringUtil.isNotEmpty(tags)){
			String arr[]=tags.split(" ");
			mav.addObject("tags", StringUtil.filterWhite(Arrays.asList(arr)));
		}else{
			mav.addObject("tags", null);
		}
		mav.addObject("article", article);
		mav.addObject("mainPage", "foreground/article/view.jsp");
		mav.addObject("pageCode", this.genUpAndDownPageCode(articleService.getLastArticle(id),articleService.getNextArticle(id),request.getServletContext().getContextPath()));
		mav.addObject("pageTitle",article.getTitle());
		mav.setViewName("mainTemp");
		return mav;
	}
	
	/**
	 * ��ȡ��һƪ���Ӻ���һƪ���Ӵ���
	 * @param lastBlog
	 * @param nextBlog
	 * @return
	 */
	private String genUpAndDownPageCode(Article lastArticle,Article nextArticle,String projectContext){
		StringBuffer pageCode=new StringBuffer();
		if(lastArticle==null || lastArticle.getId()==null){
			pageCode.append("<p>��һƪ��û����</p>");
		}else{
			pageCode.append("<p>��һƪ��<a href='"+projectContext+"/article/"+lastArticle.getId()+".html'>"+lastArticle.getTitle()+"</a></p>");
		}
		if(nextArticle==null || nextArticle.getId()==null){
			pageCode.append("<p>��һƪ��û����</p>");
		}else{
			pageCode.append("<p>��һƪ��<a href='"+projectContext+"/article/"+nextArticle.getId()+".html'>"+nextArticle.getTitle()+"</a></p>");
		}
		return pageCode.toString();
	}
	
}
