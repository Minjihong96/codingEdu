package web.com.springweb.myeoncheol.smc01.a01_java;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import web.com.springweb.gichan.gi04_vo.JoinMem;
import web.com.springweb.myeoncheol.vo.Assignment;
import web.com.springweb.myeoncheol.vo.JoinMembership;
import web.com.springweb.myeoncheol.vo.Submission;

@Service
public class Serviceclass {
	
	@Autowired(required=false)
	private InterfaceDao dao;


	
	public List<JoinMembership> getMemberList(JoinMembership sch){
		if(sch.getMemName()==null) sch.setMemName("");
		if(sch.getMemId()==null) sch.setMemId("");
		// "%" + get XXX "%"
		sch.setMemName("%"+sch.getMemName()+"%");
		sch.setMemId("%"+sch.getMemId()+"%");
	
		return dao.getMemberList(sch);
	}
	// 회원정보 상세
	public JoinMembership memberById(int memPird) {
		return dao.memberById(memPird);
	}
	public JoinMembership getMemberByPrid(int memPrid) {
		return dao.getMemberByPrid(memPrid);
	}
	// 로그인
	public JoinMem selectMember(JoinMem login) {
		return dao.selectMember(login);
	}
	
	// 회원정보 수정
	public String updateSt(JoinMem upt) {
		return dao.updateSt(upt)>0?"수정성공":"수정실패";
	}
	// 회원정보 삭제
	public String deleteSt(JoinMem del) {
		return dao.deleteSt(del)>0?"삭제성공":"삭제성공";
	}
	
	// 과제 목록
	public List<Assignment> getAssignment(int materialId) {
		return dao.getAssignment(materialId);
	}
	// 과제목록 2
	public List<Assignment> getAssignmentId(Assignment sch){
		if(sch.getTitle()==null) sch.setTitle("");
		if(sch.getContent()==null) sch.setContent("");
		
		sch.setTitle("%"+sch.getTitle()+"%");
		sch.setContent("%"+sch.getContent()+"%");
		
		
		return dao.getAssignmentId(sch);
	}
	


	// 과제 제출 
	
/*
	@Value("${student.upload}")
	private String path;
	public String insertAssignment(Assignment ins) {
		String msg = "";
		// 0. 등록시 기본 정보를 저장..
		msg = dao.insertAssignment(ins)>0?"등록성공\\n":"등록실패\\n";
		// 1. 파일업로드
		try {
			int cnt = 0;
			for(MultipartFile mf:ins.getAttachment()) {
				String attachment=mf.getOriginalFilename();
				if(!attachment.equals("")) {
					File file = new File(path,attachment);
					mf.transferTo(file);
					// 2. 파일정보 저장.
					cnt += dao.insertSubmission(new Submission(attachment,"게시판파일업로드:"+ins.getContent()));
				}
				
			}
			msg+=cnt+"건 파일 등록 성공";
		} catch (IllegalStateException e) {
			msg+="[파일상태예외]"+e.getMessage();
		} catch (IOException e) {
			msg+="[파일업로드 및 DB 연동 예외]"+e.getMessage();
		} catch (Exception e) {
			msg+="[일반 예외]"+e.getMessage();
		}		
		return msg;
	}
	
*/


		@Value("${student.upload}")
		private String path;
		public String insertSubmission(Submission ins) {
			
			String msg = "";
			// 0. 등록시 기본 정보를 저장..
			
			// 1. 파일업로드
			try {
				int cnt = 0;
				MultipartFile mf=ins.getReport();
				
				String Attachment=mf.getOriginalFilename();
				if(!Attachment.equals("")) {
					File file = new File(path,Attachment);
					mf.transferTo(file);
					// 2. 파일정보 저장.
					cnt++;
					
				}else {
					ins.setAttachment(" ");
				}
				msg = dao.insertSubmission(ins)>0?"등록성공\\n":"등록실패\\n";	
				
				msg+=cnt+"건 파일 등록 성공";
			} catch (IllegalStateException e) {
				msg+="[파일상태예외]"+e.getMessage();
			//} catch (IOException e) {
			//	msg+="[파일업로드 및 DB 연동 예외]"+e.getMessage();
			} catch (Exception e) {
				msg+="[일반 예외]"+e.getMessage();
			}		
			return msg;
		}
	

}
