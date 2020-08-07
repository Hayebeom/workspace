package kr.co.jhta.di.service.step7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String conf = "kr/co/jhta/di/service/step7/context-step7.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		EventNotificationServiceImpl eventNotificationServiceImpl 
		= ctx.getBean("EventNotificationServiceImpl", EventNotificationServiceImpl.class);
				
		eventNotificationServiceImpl.noticeEvent("스팸입니다", "삭제하세요");
	}
}
