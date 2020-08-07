package kr.co.jhta.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kakao")
public class KakaoTalkMessageSender implements MessageSender{
	
	@Value("${message.sender.kakao.username}")
	private String username;
	@Value("${message.sender.kakao.password}")
	private String password;
	
	@PostConstruct	// 생성된 이후에
	public void connect() {
		System.out.println(username + ", " + password + "로 카톡 서버에 연결됨");
	}
	
	@PreDestroy	// 부숴지기 전에
	public void disconnect() {
		System.out.println("으잉");
	}
	
	@Override
	public void send(String from, String to, String subject, String content) {
		System.out.println("카톡 메시지를 보냄");
		System.out.println("카톡 발신자 : " + from);
		System.out.println("카톡 수신자 : " + to);
		System.out.println("메시지 제목 : " + subject);
		System.out.println("메시지 내용 : " + content);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
}
