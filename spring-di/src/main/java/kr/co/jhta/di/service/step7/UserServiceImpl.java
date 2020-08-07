package kr.co.jhta.di.service.step7;

import java.util.ArrayList;
import java.util.List;

import kr.co.jhta.di.vo.User;

public class UserServiceImpl implements UserService {
	@Override
	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();
		
		User user1 = new User() ;
		User user2 = new User();
		User user3 = new User();
		
		user1.setTel("010-0000-0000");
		user2.setTel("010-0000-0000");
		user3.setTel("010-0000-0000");
		
		user1.setReceiveType("sms");
		user2.setReceiveType("kakao");
		user3.setReceiveType("sms");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
	}
}
