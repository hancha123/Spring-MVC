package egovframework.example.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import egovframework.example.service.MemberService;
import egovframework.example.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;

	@Override
	public List<MemberVO> selectMemberList() throws Exception {
		return memberDAO.selectMemberList();
	}
}