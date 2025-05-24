package egovframework.example.service.impl;

import egovframework.example.service.MemberVO;
import egovframework.example.service.MemberService2;

import org.springframework.stereotype.Service;
import java.util.List;

import javax.annotation.Resource;

@Service("memberService")
public class MemberService2Impl implements MemberService2 {

	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;
	
	@Override
	public List<MemberVO> selectMemberList() {
		return memberDAO.selectMemberList();
	}
	
	@Override
	public void insertMember(MemberVO member) {
		memberDAO.insertMember(member);
	}
}