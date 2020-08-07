package kr.co.jhta.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// @Controller 라는 어노테이션을 붙이면 HandlerMapping이 urlMapping 정보를 찾음
	
	// home.do가 오면 home.jsp가 열림
	@RequestMapping("/home.do")
	public String home() {	// Model model
		// HandleAdapter가 model 객체를 만들어서 전달해줌
		// 나중에 HA가 DS에 ModelAndView 반환 (Model값 + View이름 (home.jsp) )
		// request.getParameter를 이제 안씀. get, post방식도 상관없음 알아서 다 해줌
		// model.addAttribute("message", "안녕하시오");
		// model.addAttribute("notice", "점심시간은 한시간 남았소");
		// name, value로 뭐든 넣어도 됨 (jsp에서 name으로 꺼내가면 됨)

		// 1. model 객체 획득 (hander에서 모델 객체를 정의하기만 하면됨)
		// 2. model에 name,value로 값 담음
		// 3. 꺼낸다
		return "home";
	}
	
}
