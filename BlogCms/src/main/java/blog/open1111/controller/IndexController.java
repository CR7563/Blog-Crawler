package blog.open1111.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import blog.open1111.entity.Article;
import blog.open1111.entity.PageBean;
import blog.open1111.service.ArticleService;
import blog.open1111.util.PageUtil;
import blog.open1111.util.StringUtil;

/**
 * ��ҳController
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	@Resource
	private ArticleService articleService;
	
	
	/**
	 * ������ҳ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/index")
	public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request)throws Exception{
		ModelAndView mav=new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),10);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("typeId", typeId);
		List<Article> articleList=articleService.list2(map);
		Long total=articleService.getTotal2(map);
		StringBuffer param=new StringBuffer(); // ��ѯ����
		if(StringUtil.isNotEmpty(typeId)){
			param.append("typeId="+typeId+"&");
		}
		mav.addObject("pageTitle","��ҳ");
		mav.addObject("mainPage", "foreground/article/list.jsp");
		mav.addObject("articleList", articleList);
		mav.addObject("pageCode",PageUtil.genPagination(request.getContextPath()+"/index.html", total, Integer.parseInt(page), 10, param.toString()));
		mav.setViewName("mainTemp");
		return mav;
	}
	
	/**
	 * ��������
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/aboutMe")
	public ModelAndView aboutMe()throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("mainPage", "foreground/system/aboutMe.jsp");
		mav.addObject("pageTitle", "��������");
		mav.setViewName("mainTemp");
		return mav;
	}
	
}
