package web.com.springweb.myeoncheol.smc01.a01_java;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import web.com.springweb.gichan.gi04_vo.JoinMem;
import web.com.springweb.myeoncheol.vo.Assignment;
import web.com.springweb.myeoncheol.vo.JoinMembership;
import web.com.springweb.myeoncheol.vo.Submission;


@Mapper
public interface InterfaceDao {
	
	/*
   
     * JoinMem
    private int memPrid;
    private String memId;
    private String memPwd;
    private String memName;
    private String memPhone;
    private String memEmail;
    private String memAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date memBirthday;
    private String accountType;
    private Timestamp createdAt;
    private Timestamp updatedAt;@return 조회된 Member 객체들의 리스트
     * 
     * 
     */
	
	@Select("SELECT * FROM JOIN_MEMBERSHIP WHERE MEM_PRID = #{memPrid}")
	JoinMembership memberById(@Param("memPrid")int memPird);
	
	
	@Select("SELECT MEM_ID , MEM_NAME FROM JOIN_MEMBERSHIP WHERE MEM_PRID=#{memPrid}")
	JoinMembership getMemberByPrid(@Param("memPrid") int memPrid);
	
	// 0701추가
	@Select("SELECT * FROM JOIN_MEMBERSHIP \r\n"
			+ "			WHERE MEM_NAME LIKE #{memName} \r\n"
			+ "			AND MEM_ID LIKE #{memId} \r\n"
			+ " ORDER BY MEM_PRID DESC")
			List<JoinMembership> getMemberList(JoinMembership sch);
	
	@Select("SELECT * FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId} AND MEM_PWD = #{memPwd}")
	JoinMem selectMember(JoinMem login);
	
	
	@Update("UPDATE JOIN_MEMBERSHIP\r\n"
			+ "	SET MEM_PWD = #{memPwd},\r\n"
			+ "		MEM_NAME = #{memName},\r\n"
			+ "		MEM_PHONE = #{memPhone},\r\n"
			+ "		MEM_EMAIL = #{memEmail},\r\n"
			+ "		MEM_ADDRESS = #{memAddress},\r\n"
			+ "		MEM_BIRTHDAY = #{memBirthday},\r\n"
			+ "		ACCOUNT_TYPE = #{accountType}\r\n"
			+ "	WHERE MEM_ID = #{memId}")
	int updateSt(JoinMem upt);
	
	@Delete("DELETE FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId}")
	int deleteSt(JoinMem del);
	
	@Select("SELECT * FROM ASSIGNMENTS \r\n"
			+ "WHERE MATERIAL_ID=#{materialId}")
	List<Assignment> getAssignment(@Param("materialId")int materialId);
	
	// 제목과 내용으로 검색
	@Select("SELECT * FROM ASSIGNMENTS\r\n"
			+ "			WHERE TITLE LIKE '%%' AND \r\n"
			+ "			CONTENT LIKE '%%' ORDER BY ASSIGNMENT_ID DESC")
			List<Assignment> getAssignmentId(Assignment sch);
			// 과제 제출

	// 0701 추가 
	@Insert("INSERT INTO SUBMISSIONS (SUBMISSION_ID, MEM_PRID, ASSIGNMENT_ID, CONTENT, ATTACHMENT, SUBMIT_DATE) " +
	        "VALUES (SUBMIT_SEQ.NEXTVAL, #{memPrid}, #{assignmentId}, #{content}, #{attachment}, SYSDATE)")
	int insertSubmission(Submission ins);
	
	
	

}
