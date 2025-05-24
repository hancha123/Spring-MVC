package egovframework.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController6 {

	@GetMapping("/members/memberInfo.do")
	public String form() {
		return "memberInfo";
	}
}