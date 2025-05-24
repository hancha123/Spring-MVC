package egovframework.example.service.impl;

import java.util.List;
import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;
import egovframework.example.service.MemberVO;

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractMapper {

	public List<MemberVO> selectMemberList() {
		return selectList("MemberDAO.selectMemberList");
	}
	
	public void insertMember(MemberVO member) {
	    insert("MemberDAO.insertMember", member);
	}
}