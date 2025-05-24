package egovframework.example.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.service.MemberService;
import egovframework.example.service.MemberVO;

@RestController
public class MemberController {

	@Resource(name = "memberService")
	private MemberService memberService;

	@RequestMapping(value = "/selectMemberList.do", method = RequestMethod.GET)
	public List<MemberVO> selectMemberList() throws Exception {
		return memberService.selectMemberList();
	}
}