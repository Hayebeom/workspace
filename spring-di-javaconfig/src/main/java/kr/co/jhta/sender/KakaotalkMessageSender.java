package kr.co.jhta.sender;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KakaotalkMessageSender implements MessageSender {

	@Value("${message.sender.kakao.username}")
	private String username;
	@Value("${message.sender.kakao.password}")
	private String password;
	
	@PostConstruct
	public void connect() {
		System.out.println(username + ", " + password + "계정으로 카톡서버 접속됨");
	}
	
	@PreDestroy
	public void disconnect() {
		System.out.println(username + " 계정이 카톡서버와 연결 해제됨");
	}
	
	@Override
	public void send(String from, String no, String subject, String content) {		
		System.out.println("카톡 메시지 발송");
		System.out.println("카톡 메시지 발신자 : " + from);
		System.out.println("카톡 메시지 수신자 : " + no);
		System.out.println("카톡 메시지 제목 : " + subject);
		System.out.println("카톡 메시지 내용 : " + content);
	}
}
