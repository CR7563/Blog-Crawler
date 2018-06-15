package blog.open1111.quartz;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import blog.open1111.service.impl.InitComponent;

/**
 * ��ȡ�������� ��ʱ����
 * @author user
 *
 */
@Component
public class LoadHotArticleJob {

	/**
	 * ÿ30����ִ��һ��
	 */
	@Scheduled(cron="0 0/30 * * * ?")
	public void work(){
		new InitComponent().refreshSystem(ContextLoader.getCurrentWebApplicationContext().getServletContext());
	}
}
