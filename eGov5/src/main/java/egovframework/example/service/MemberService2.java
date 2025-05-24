package egovframework.example.service;

import java.util.List;

public interface MemberService2 {
	List<MemberVO> selectMemberList();

	void insertMember(MemberVO member);
}