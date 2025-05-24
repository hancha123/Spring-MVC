package egovframework.example.web;

import egovframework.example.service.MemberVO;
import egovframework.example.service.RedirectResponse;
import egovframework.example.service.MemberService2;

import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
//@RequestMapping("/members")	// 이렇게 하는 경우 모든 Mapping URL에 접두어로 들어 간다.
public class MemberController5 {

	@Resource(name = "memberService")
	private MemberService2 memberService;

	@GetMapping("/members/selectMemberList")
	public List<MemberVO> getMembers() {
		return memberService.selectMemberList();
	}	
	
    @PostMapping("/members/insertMember2")
    public ResponseEntity<RedirectResponse> insertMember(@RequestBody MemberVO member, HttpServletRequest request) {        
    	//System.out.println(member.getName());
    	//System.out.println(member.getEmail());
    	memberService.insertMember(member);
    	
        // 리디렉션할 URL 설정        
        String contextPath = request.getContextPath();
        String redirectUrl = contextPath + "/members/selectMemberList";

        // JSON 응답 반환
        return ResponseEntity.ok(new RedirectResponse(redirectUrl));
    }	
}