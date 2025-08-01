package web.com.springweb.project.p03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import web.com.springweb.myeoncheol.vo.JoinMembership;
import web.com.springweb.project.p04_vo.ClassRecord;
import web.com.springweb.project.p04_vo.CounselRequest;
import web.com.springweb.project.p04_vo.Enrollments;
import web.com.springweb.project.p04_vo.JoinMem;
import web.com.springweb.project.p04_vo.Materials;
import web.com.springweb.project.p04_vo.Withdrawal;


@Mapper
public interface P_Dao {
	// 이기찬
	//회원가입
	@Insert("INSERT INTO JOIN_MEMBERSHIP(MEM_PRID, MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, "
			+ "MEM_EMAIL, MEM_ADDRESS, MEM_BIRTHDAY, ACCOUNT_TYPE) "
			+ "VALUES(PRID_SEQ.NEXTVAL, #{memId}, #{memPwd}, #{memName}, #{memPhone}, #{memEmail}, #{memAddress}, #{memBirthday}, #{accountType})")
	int insertJoinMem(JoinMem ins);
	// 아이디 중복 체크
	@Select("SELECT COUNT(*) FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId}")
	int checkId(String memId);
	// 로그인
	@Select("SELECT * FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId} AND MEM_PWD = #{memPwd}")
	JoinMem selectMember(JoinMem login);
	// 관리자 회원 정보 수정
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
	// 관리자 회원 탈퇴
	@Delete("DELETE FROM JOIN_MEMBERSHIP WHERE MEM_ID = #{memId}")
	int deleteMem(JoinMem del);
	// 강의 목록 전채 리스트
	@Select("SELECT * FROM MATERIALS WHERE TITLE LIKE #{title} ORDER BY MATERIAL_ID")
	List<Materials> getMaterialList(Materials sch);
	// 클릭시 강의 목록 가져오기
	@Select("SELECT * FROM MATERIALS WHERE MATERIAL_ID = #{materialId}")
	Materials matById(@Param("materialId")int materialId);
	// 버튼으로 넘길 수강 신청(학생)
	@Insert("INSERT INTO ENROLLMENTS VALUES(ENR_SEQ.NEXTVAL, #{memPrid}, #{materialsId}, #{status}, SYSDATE)")
	int insertEnr(Enrollments ins);
	// 상태에 따라 버튼 구성(학생)
	@Select("SELECT STATUS FROM ENROLLMENTS WHERE MEM_PRID = #{memPrid} AND MATERIALS_ID = #{materialsId}")
	String getStatusByMemberAndMaterial(@Param("memPrid") int memPrid, @Param("materialsId") int materialsId);
	// 수강 신청 취소(학생)
	@Delete("DELETE FROM ENROLLMENTS WHERE MEM_PRID = #{memPrid} AND MATERIALS_ID = #{materialsId}")
	int deleteEnrollment(Enrollments del);
	// 수강 신청 확인(학생)
	@Select("SELECT * FROM ENROLLMENTS WHERE MEM_PRID = #{memPrid}")
	List<Enrollments> getEnrollmentsByMember(int memPrid);
	// 관리자 전체 수강 신청 목록 리스트 
	@Select("SELECT * FROM ENROLLMENTS WHERE STATUS LIKE #{status}")
	List<Enrollments> getEnroll(Enrollments sch);
	// 관리자 수강 신청 상태 수정 버튼
	@Update("UPDATE ENROLLMENTS SET STATUS = #{status} WHERE ENR_ID = #{enrId}")
	int updateEnrollmentStatus(@Param("enrId") int enrId, @Param("status") String status);
	// 회원 탈퇴 이유 입력(학생)
	@Insert("INSERT INTO MEMBER_WITHDRAWAL "
			+ "VALUES(WITHDRAWAL_SEQ.NEXTVAL, #{memPrid}, #{memName}, #{reason}, SYSDATE)")
	int insertWithdrawal(@Param("memPrid") int memPrid, 
            @Param("memName") String memName, 
            @Param("reason") String reason);
	
	// 지홍님 파트
	// 수업기록
	@Select("SELECT * FROM class_record WHERE CLASS_CONTENTS LIKE #{classContents}")
	List<ClassRecord> classRecordList(ClassRecord sch);
	// 수업기록 입력
	@Insert("INSERT INTO class_record (record_id, mem_prid, class_date, class_contents, subject, session_number, payment, etc) "
			+ "VALUES (crid_Seq.NEXTVAL, #{memPrid}, #{classDate}, #{classContents}, #{subject}, #{sessionNumber}, #{payment}, #{etc})")
	int insertClassRecord(ClassRecord ins);
	// 회원 타입이 학생일 때 학생 이름과 학생 고유 아이디 가져오기
	@Select("SELECT MEM_NAME, MEM_PRID FROM JOIN_MEMBERSHIP WHERE ACCOUNT_TYPE='student'")
	List<JoinMem> studentList(JoinMem sch);
	@Delete("DELETE FROM class_record WHERE RECORD_ID=#{recordId}")
	int classRecordDelete(@Param("recordId") int recordId);
	@Update("UPDATE class_record SET CLASS_DATE = #{classDate, jdbcType=DATE}, CLASS_CONTENTS = #{classContents}, SUBJECT = #{subject}, SESSION_NUMBER = #{sessionNumber}, PAYMENT = #{payment}, ETC = #{etc} WHERE RECORD_ID = #{recordId}")
	int classRecordEdit(ClassRecord upt);
	@Select("SELECT * FROM Class_Record WHERE record_ID = #{recordId}")
	ClassRecord getClassRecord(@Param("recordId") int recordId);
	@Update("UPDATE class_record SET CLASS_DATE = #{classDate, jdbcType=DATE}, "
			+ "CLASS_CONTENTS = #{classContents}, SUBJECT = #{subject}, "
			+ "SESSION_NUMBER = #{sessionNumber}, PAYMENT = #{payment}, "
			+ "ETC = #{etc} WHERE RECORD_ID = #{recordId}")
	int updateClassRecord(ClassRecord upt);
	// 승우님 무료 체험 신청
    @Select("SELECT * FROM counsel_request"
    		+ " WHERE NAME LIKE #{name}")
    List<CounselRequest> crList(CounselRequest sch);
    
    @Insert("INSERT INTO counsel_request (name, phone, counseling_time, department, message) "
    		+ "VALUES (#{name}, #{phone}, #{counselingTime}, #{department}, #{message})")
    int insertCR(CounselRequest ins);
    
    // 명철님 일반회원(학생) 
    // 조회 버튼 누르면 아이디값이 가서 상세페이지
	@Select("SELECT * FROM JOIN_MEMBERSHIP WHERE MEM_PRID = #{memPrid}")
	JoinMem memberById(@Param("memPrid")int memPird);
	
	// 회원정보리스트(선생님이랑 관리자 페이지로 연결되게 하기 -> 완료)
	@Select("SELECT * FROM JOIN_MEMBERSHIP \r\n"
			+ "			WHERE MEM_NAME LIKE #{memName} \r\n"
			+ "			AND MEM_ID LIKE #{memId} \r\n"
			+ " ORDER BY MEM_PRID DESC")
	List<JoinMem> getMemberList(JoinMem sch);
	// prid값 받아서 회원아이디, 이름 받아오는 페이지 구문입니다.
	@Select("SELECT MEM_ID , MEM_NAME FROM JOIN_MEMBERSHIP WHERE MEM_PRID=#{memPrid}")
	JoinMembership getMemberByPrid(@Param("memPrid") int memPrid);
	
}
