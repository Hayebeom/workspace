package kr.co.jhta.di.service.step8;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		String conf = "kr/co/jhta/di/service/step8/context-step8.xml";
		String conf = "kr/co/jhta/di/service/step8/context-step8-map.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
//		NoticeService noticeService = ctx.getBean("NoticeService", NoticeService.class);
		NoticeService noticeService = ctx.getBean("noticeServiceUsingMap", NoticeService.class);
		noticeService.notice("경리팀", "안내", "임원급 이상 확인");
		
		ctx.destroy();
	}
}
