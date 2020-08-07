package kr.co.jhta.di.step1;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.SmsMessageSender;

public class Main {
	public static void main(String[] args) {
		String conf = "classpath:/spring/context-step1.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
//		SmsMessageSender sms = ctx.getBean(SmsMessageSender.class);
		EventNotificationServiceImpl ens = ctx.getBean(EventNotificationServiceImpl.class);

//		sms.send("홍보부", "고객", "아", "배아프다");
		ens.notice("재무부", "아직도", "아프다");
	}
}
