package egovframework.example.web;

import egovframework.example.service.MemberVO;
import egovframework.example.service.MemberService2;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController4 {

	@Resource(name = "memberService")
	private MemberService2 memberService;

	@GetMapping("/members/form")
	public String form() {
		return "memberForm";
	}	
	
    @PostMapping("/members/insertMember")
    public String insertMember(MemberVO member) {
        memberService.insertMember(member);
        return "redirect:/members/selectMemberList"; // 또는 다른 결과 페이지로 리디렉션
    }
}