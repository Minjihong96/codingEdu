package web.com.springweb.gichan.gi03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import web.com.springweb.gichan.gi04_vo.Enrollments;
import web.com.springweb.gichan.gi04_vo.JoinMem;
import web.com.springweb.gichan.gi04_vo.Materials;

@Mapper
public interface Join_MembershipDao {
	@Insert("INSERT INTO JOIN_MEMBERSHIP(MEM_PRID, MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, "
			+ "MEM_EMAIL, MEM_ADDRESS, MEM_BIRTHDAY, ACCOUNT_TYPE) "
			+ "VALUES(PRID_SEQ.NEXTVAL, #{memId}, #{memPwd}, #{memName}, #{memPhone}, #{memEmail}, #{memAddress}, #{memBirthday}, #{accountType})")
	int insertJoinMem(JoinMem ins);
	
	@Select("SELECT COUNT(*) FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId}")
	int checkId(String memId);
	
	@Select("SELECT * FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId} AND MEM_PWD = #{memPwd}")
	JoinMem selectMember(JoinMem login);
	
    // 조회 버튼 누르면 아이디값이 가서 상세페이지
	@Select("SELECT * FROM JOIN_MEMBERSHIP WHERE MEM_PRID = #{memPrid}")
	JoinMem memberById(@Param("memPrid")int memPird);
	
	// 회원정보리스트(선생님이랑 관리자 페이지로 연결되게 하기)
	@Select("SELECT * FROM JOIN_MEMBERSHIP \r\n"
			+ "			WHERE MEM_NAME LIKE #{memName} \r\n"
			+ "			AND MEM_ID LIKE #{memId} \r\n"
			+ " ORDER BY MEM_PRID DESC")
	List<JoinMem> getMemberList(JoinMem sch);
	// 회원정보 수정
	@Update("UPDATE JOIN_MEMBERSHIP\r\n"
			+ "	SET MEM_PWD = #{memPwd},\r\n"
			+ "		MEM_NAME = #{memName},\r\n"
			+ "		MEM_PHONE = #{memPhone},\r\n"
			+ "		MEM_EMAIL = #{memEmail},\r\n"
			+ "		MEM_ADDRESS = #{memAddress},\r\n"
			+ "		MEM_BIRTHDAY = #{memBirthday},\r\n"
			+ "		ACCOUNT_TYPE = #{accountType}\r\n"
			+ "	WHERE MEM_ID = #{memId}")
	int updateMem(JoinMem upt);
	// 회원정보 삭제
	@Delete("DELETE FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId}")
	int deleteMem(JoinMem del);
	// 강의 목록 전채 리스트
	@Select("SELECT * FROM MATERIALS WHERE TITLE LIKE #{title} ORDER BY MATERIAL_ID")
	List<Materials> getMaterialList(Materials sch);
	// 클릭시 강의 목록 가져오기
	@Select("SELECT * FROM MATERIALS WHERE MATERIAL_ID = #{materialId}")
	Materials matById(@Param("materialId")int materialId);
	// 버튼으로 넘길 수강 신청 확인
	@Insert("INSERT INTO ENROLLMENTS VALUES(ENR_SEQ.NEXTVAL, #{memPrid}, #{materialsId}, #{status}, SYSDATE)")
	int insertEnr(Enrollments ins);
}
