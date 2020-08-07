package kr.co.jhta.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.jhta.form.LoginForm;
import kr.co.jhta.service.UserService;
import kr.co.jhta.vo.User;

@Controller
@SessionAttributes("LOGIN_USER")
public class SignInOutController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/signin.do")
	public String signIn(Model model) {
		LoginForm loginForm = new LoginForm();
		model.addAttribute("loginForm", loginForm);
		// 1. 모델에 loginForm으로 담고
		
		return "loginform";
	}
	
	@PostMapping("/signin.do")
	public String login(@ModelAttribute("loginForm") @Valid LoginForm loginForm, BindingResult errors, Model model) {
		//// @Valid : 유효한 값인지 검사
		//// UserForm에 데이터를 넣고 @Valid로 유효성 검사를 한 뒤, 바로 뒤에 있는 BindingResult로 에러 데이터를 담아놓음 (에러가 발생했다면 들어감)
		//// UserForm 과 BindingResult 사이에 변수가 있으면 안됨
		
		if (errors.hasErrors()) {
			return "loginform";
		}
		
		// 로그인 처리
		User user = userService.login(loginForm.getUserId(), loginForm.getUserPwd());
		
		if (user == null) {
			return "redirect:/signin.do?error=fail";
		}
		
		// 로그인된 사용자 정보를 세션에 저장한다
//		session.setAttribute("LOGIN_USER", user);
		model.addAttribute("LOGIN_USER", user);
		
		return "redirect:/home.do";
	}
	
	@GetMapping("/signout.do")
	public String signout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		
		return "redirect:/home.do";
	}
	
}
