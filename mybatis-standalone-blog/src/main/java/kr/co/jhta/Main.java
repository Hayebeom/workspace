package kr.co.jhta;

import java.util.List;

import kr.co.jhta.dao.BlogDao;
import kr.co.jhta.dao.UserDao;
import kr.co.jhta.dto.BlogDto;
import kr.co.jhta.vo.Blog;
import kr.co.jhta.vo.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		BlogDao blogDao = new BlogDao();
		
//		User user = userDao.getUserById("hong2");
//		System.out.println(user.getName());
		
//		Blog blog = new Blog("맛있는 블로그", "hong3", "맛있게 요리를 하는방법을 서술하려했으나 여백이 부족해 적지 않는다");
//		blogDao.insertBlog(blog);
//		System.out.println(blog.getNo() + ", " + blog.getTitle() + ", " + blog.getWriter() + ", " + blog.getContent());
		
//		List<BlogDto> blogDtos = blogDao.getAllBlogs();
//		for (BlogDto blogDto : blogDtos) {
//			System.out.println(blogDto.getBlogTitle() + ", " + blogDto.getBlogWriter() + ", " + blogDto.getUserName());
//		}
		
//		BlogDto blogDto = blogDao.getBlogByNo(1);
//		if (blogDto != null) {
//			System.out.println(blogDto.getBlogNo() + ", " + blogDto.getBlogTitle() + ", " + blogDto.getBlogWriter() + ", " + blogDto.getUserId() + ", " + blogDto.getUserName());
//		} else {
//			System.out.println("실패!");
//		}
		
		Blog blog = new Blog(1, "사실 맛있다", "hong3", "반전의 반전");
		blogDao.updateBlog(blog);
		System.out.println("변경완료!");
		
	}
}
