package egovframework.example.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> selectMemberList() throws Exception;
}