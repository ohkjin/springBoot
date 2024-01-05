package edu.pnu.dao;


import java.util.List;

import edu.pnu.domain.MemberVO;

public interface MemberDAO {

public int updateMember(MemberVO vo);
public int removeMember(Integer id);
public int addMember(MemberVO vo);
public List<MemberVO> getMembers();
public MemberVO getMemberbyID(Integer id);

}
