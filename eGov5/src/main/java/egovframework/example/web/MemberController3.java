package egovframework.example.web;

import egovframework.example.service.MemberVO;
import egovframework.example.service.MemberService2;

import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
//@RequestMapping("/members")	// 이렇게 하는 경우 모든 Mapping URL에 접두어로 들어 간다.
public class MemberController3 {

	@Resource(name = "memberService")
	private MemberService2 memberService;

	@GetMapping("/members/selectMemberList")
	public List<MemberVO> getMembers() {
		return memberService.selectMemberList();
	}
}