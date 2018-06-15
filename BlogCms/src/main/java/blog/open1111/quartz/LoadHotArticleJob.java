package blog.open1111.quartz;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import blog.open1111.service.impl.InitComponent;

/**
 * 获取热门帖子 定时任务
 * @author user
 *
 */
@Component
public class LoadHotArticleJob {

	/**
	 * 每30分钟执行一次
	 */
	@Scheduled(cron="0 0/30 * * * ?")
	public void work(){
		new InitComponent().refreshSystem(ContextLoader.getCurrentWebApplicationContext().getServletContext());
	}
}
