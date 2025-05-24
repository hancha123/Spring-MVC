package egovframework.example.web;

import egovframework.example.service.MemberService2;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController7 {

	@Resource(name = "memberService")
	private MemberService2 memberService;

	@GetMapping("/members/form2")
	public String form() {
		return "memberForm2";
	}		
}