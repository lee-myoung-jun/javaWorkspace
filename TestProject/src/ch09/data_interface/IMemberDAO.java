package ch09.data_interface;

import java.util.ArrayList;

public interface IMemberDAO {
	//추상메소드

	//회원등록
	public void insertMember(MemberDTO dto);
	
	//회원정보 삭제
	public void deleteMember(String memId);
	
	//전체 회원정보 조회
	public ArrayList<MemberDTO> getAllMember();
	
	//한명 회원정보 조회
	public MemberDTO seachMember(String memId);
	
	//회원정보 수정
	public void updateMember(MemberDTO dto);

}