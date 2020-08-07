package kr.co.jhta.di.step2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.di.MessageSender;

@Service
public class AlarmServiceImpl implements AlarmService {

//	@Autowired	얘로는 id로 식별 불가능해서 지움
	@Resource(name="kakao")
//	1. @Resource
	private MessageSender messageSender;
//	2. private MessageSender kakao;
	
	@Override
	public void alarm(String message) {
		messageSender.send("민방위", "국민", "비상", message);
//	3.	kakao.send("민방위", "국민", "비상", message); 으로도 가능
	}
	
}
