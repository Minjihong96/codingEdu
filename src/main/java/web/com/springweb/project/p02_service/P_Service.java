package web.com.springweb.project.p02_service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import web.com.springweb.project.p04_vo.ClassRecord;
import web.com.springweb.project.p04_vo.CounselRequest;
import web.com.springweb.project.p04_vo.JoinMem;
import web.com.springweb.project.p04_vo.Enrollments;
import web.com.springweb.project.p04_vo.Materials;
import web.com.springweb.project.p04_vo.Withdrawal;
import web.com.springweb.myeoncheol.vo.JoinMembership;
import web.com.springweb.project.p03_dao.P_Dao;

@Service
public class P_Service {
	@Autowired(required = false)
	private P_Dao dao;
	@Value("${user.upload}")
	private String path;
	// 이기찬
	// 회원가입
	public String insertJoinMem(JoinMem ins) {
		return dao.insertJoinMem(ins)>0?"등록성공":"등록실패";
	}
	// 아이디 중복 체크
	public boolean checkId(String memId) {
	    return dao.checkId(memId) == 0;  // 중복이 없으면 true (가입 가능)
	}
	// 로그인
	public JoinMem selectMember(JoinMem login) {
		return dao.selectMember(login);
	}
	// 회원정보 수정
	public String updateMem(JoinMem upt) {
		return dao.updateMem(upt)>0?"수정성공":"수정실패";
	}
	// 회원정보 삭제
	public String deleteMem(JoinMem del) {
		return dao.deleteMem(del)>0?"삭제성공":"삭제성공";
	}
	// 강의 목록 전채 리스트
	public List<Materials> getMaterialList(Materials sch) {
		if(sch.getTitle()==null) sch.setTitle("");
		sch.setTitle("%"+sch.getTitle()+"%");
		return dao.getMaterialList(sch);
	}
	// 클릭시 강의 목록 가져오기
	public Materials matById(int materialId) {
		return dao.matById(materialId);
	}
	// 버튼으로 넘길 수강 신청 확인(학생)
	public String insertEnr(Enrollments ins) {
		return dao.insertEnr(ins)>0?"신청성공":"신청실패";
	}
	// 상태에 따라 버튼 구성(학생)
	public String getStatusByMemberAndMaterial(int memPrid, int materialsId) {
	    return dao.getStatusByMemberAndMaterial(memPrid, materialsId);
	}
	// 수강 신청 취소 버튼(학생)
	public String deleteEnrollment(Enrollments del) {
		return dao.deleteEnrollment(del)>0?"수강 취소 성공":"취소 실패";
	}
	// 수강 신청 확인(학생)
	public List<Enrollments> getEnrollmentsByMember(int memPrid) {
	    return dao.getEnrollmentsByMember(memPrid);
	}
	// 관리자 전체 수강 신청 목록 리스트 
	public List<Enrollments> getEnroll(Enrollments sch) {
		if(sch.getStatus()==null) sch.setStatus("");
		sch.setStatus("%"+sch.getStatus()+"%");
		return dao.getEnroll(sch);
	}
	// 관리자 수강 신청 상태 수정 버튼
	public int updateEnrollmentStatus(int enrId, String status) {
	    return dao.updateEnrollmentStatus(enrId, status);
	}
	// 회원 탈퇴 이유 입력(학생)
	public String insertWithdrawal(int memPrid, String memName, String reason) {
		return dao.insertWithdrawal(memPrid, memName, reason)>0?"등록성공":"등록실패";
	}
	
	//지홍님 파트
	// 수업 기록 리스트
	public List<ClassRecord> classRecordList(ClassRecord sch) {
		if(sch.getClassContents()==null) sch.setClassContents("");
		sch.setClassContents("%"+sch.getClassContents()+"%");
		return dao.classRecordList(sch);
	}
	// 수업 기록 입력
	public String insertClassRecord(ClassRecord ins) {
		
		return dao.insertClassRecord(ins)>0?"등록성공":"등록실패";
	}
	public List<JoinMem> studentList(JoinMem sch) {
		return dao.studentList(sch);
	}
	public String classRecordDelete(int recordId) {
		return dao.classRecordDelete(recordId) > 0 ? "삭제했습니다." : "삭제 실패했습니다.";
	}
	public String classRecordEdit(ClassRecord upt) {
		return dao.classRecordEdit(upt)>0?"수정 성공":"수정 실패";
	}
	public ClassRecord getClassRecord(int recordId) {
		return dao.getClassRecord(recordId);
	}
	 public String updateClassRecord(ClassRecord upt) {
		return dao.updateClassRecord(upt)>0?"수정성공":"수정실패";
	 }
	// 승우님 파트
	// 무료 체험리스트 보는 곳
	public List<CounselRequest> crList(CounselRequest sch) {
		if(sch.getName()==null) sch.setName("");
		sch.setName("%"+sch.getName()+"%");	
		return dao.crList(sch);
	}
	// 무료 체험 신청 폼
	public String insertCR(CounselRequest ins) {
		return dao.insertCR(ins)>0?"등록성공":"등록실패";
	}
	
	// 명철님 파트
	// 조회 버튼 누르면 아이디값이 가서 상세페이지
	public JoinMem memberById(int memPird) {
		return dao.memberById(memPird);
	}
	// 회원정보리스트(선생님이랑 관리자 페이지로 연결되게 하기)
	public List<JoinMem> getMemberList(JoinMem sch) {
		if(sch.getMemName()==null) sch.setMemName("");
		if(sch.getMemId()==null) sch.setMemId("");
		sch.setMemName("%"+sch.getMemName()+"%");
		sch.setMemId("%"+sch.getMemId()+"%");
		return dao.getMemberList(sch);
	}
	
	// prid 값 받아서 이름과 아이디 조회
	public JoinMembership getMemberByPrid(int memPrid) {
		return dao.getMemberByPrid(memPrid);
	}
	
	
	
	
}
