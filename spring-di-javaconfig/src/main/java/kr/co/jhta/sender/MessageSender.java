package kr.co.jhta.sender;

public interface MessageSender {
	
	void send(String from, String no, String subject, String content);
}
