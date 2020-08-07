package kr.co.jhta.step1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.jhta.sender.KakaotalkMessageSender;
import kr.co.jhta.sender.MessageSender;
import kr.co.jhta.service.EventService;
import kr.co.jhta.service.EventServiceImpl;

@Configuration
public class JavaConfig {
	
	/*
	 * spring bean configuration 파일의 설정과 동일하게 자바코드로 정의한 것
	 * => <bean id="kakao" class="kr.co.jhta.sender.KakaotalkMessageSender" /> 와 같다는 뜻
	 */
	@Bean
	public MessageSender messageSender() {
		return new KakaotalkMessageSender();
	}
	
	/*
	 * <bean id="eventService" class="kr.co.jhta.service.EventServiceImpl">
	 * 		<property name="messageSender" ref="messageSender" />
	 * </bean>
	 */
	@Bean
	public EventService eventService(MessageSender messageSender) {
		EventServiceImpl eventServiceImpl = new EventServiceImpl();
		eventServiceImpl.setMessageSender(messageSender);
		return eventServiceImpl;
	}
}
