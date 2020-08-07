package kr.co.jhta.form;

import org.springframework.web.multipart.MultipartFile;

// 입력 폼의 값을 가져올 땐 이런 방식을 사용

// 폼 커맨드 객체
// * 폼 커맨드객체는 입력필드의 값을 저장하기 위해서 생성한 객체다
// * <form /> 태그에서 정의한 모든 입력필드값을 한 번에 담기 위해서 사용하는 객체다
// * 요청핸들러 메서드의 파라미터로 폼 커맨드 객체를 매개변수로 선언하면
//   HandlerAdapter가
// 		1. 폼 커맨드 객체를 생성한다 (default 생성자가 꼭 필요하다)
//		2. 폼 커맨드 객체의 필드명을 검색한다
//		3. 폼 커맨드 객체의 필드명과 동일한 이름의 요청파라미터값을 요청객체에서 조회한다
//		4. 조회된 요청파라미터값을 폼 커맨드 객체의 필드에 저장한다
//			(기본자료형타입, 스트링 타입등은 필요한 경우 형변환을 수행한다)
//		5. 모든 요청파라미터값의 저장이 완료되면, 요청핸들러 메서드를 실행하면서 매개변수로 전달한다


public class BoardForm {

	private String title;
	private String content;
	private String password;
	private MultipartFile upfile;
	/* 
	 * 첨부파일을 담을 땐 항상 MultipartFile로 담아야된다 (String이 아니라)
	 * form 안에는 첨부파일이 담기고 vo에는 파일의 이름이 담긴다
	 */

	public MultipartFile getUpfile() {
		return upfile;
	}

	public void setUpfile(MultipartFile upfile) {
		this.upfile = upfile;
	}
	
	public BoardForm() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
