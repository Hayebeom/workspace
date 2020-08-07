package kr.co.jhta.di.step2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String conf = "classpath:/spring/context-step2.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		AlarmServiceImpl alarmServiceImpl = ctx.getBean(AlarmServiceImpl.class);
		
		alarmServiceImpl.alarm("i still sick");
	}
	
}
