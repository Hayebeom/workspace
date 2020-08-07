package kr.co.jhta;

import java.util.List;

import kr.co.jhta.dao.UserDao;
import kr.co.jhta.vo.User;

public class Main {
	
	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
//		System.out.println("새 사용자 등록");
//		User user1 = new User("hong3", "홍삼", "zxcv1234", "hong3@gmail.com");
//		userDao.insertUser(user1);
//		System.out.println("새 사용자 등록이 완료되었습니다.");
		
//		System.out.println("전체 사용자 삭제");
//		userDao.deleteAllUsers();
//		System.out.println("삭제 완료!");
		
//		System.out.println("아이디로 사용자 삭제");
//		userDao.deleteUserById("hong1");
//		System.out.println("해당 사용자 삭제 완료!");
		
//		System.out.println("아이디로 사용자 업데이트");
//		User updateUser = new User("hond2", "홍삼", "zxc123", "h3@gmail.com");
//		userDao.updateUser(updateUser);
//		System.out.println("업데이트 완료!");
		
//		System.out.println("모든 사용자 조회");
//		List<User> users = userDao.getAllUsers();
//		for (User user : users) {
//			System.out.println(user.getId() + ", " + user.getName());
//		}
//		System.out.println();
		
		System.out.println("이름으로 사용자 목록 조회");
		List<User> users = userDao.getUsersByName("홍삼");
		
		for (User user : users) {
			System.out.println(user.getId() + ", " + user.getName());
		}
		
//		System.out.println("특정 아이디의 사용자 조회");
//		User user = userDao.getUserById("hong3");
//		// null인지 확인
//		System.out.println(user);
//		
//		if (user != null) {
//			System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail() + ", " + user.getCreatedDate());
//		} else {
//			System.out.println("지정된 사용자가 존재하지 않습니다");
//		}
		
//		System.out.println("전체 사용자 수 조회");
//		int userCount = userDao.getUsersCount();
//		System.out.println("전체 사용자 수 : " + userCount);
	}
}
