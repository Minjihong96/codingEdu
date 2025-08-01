package web.com.springweb.project.p01_controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import web.com.springweb.project.p02_service.P_Service;
import web.com.springweb.project.p04_vo.ClassRecord;
import web.com.springweb.project.p04_vo.CounselRequest;
import web.com.springweb.project.p04_vo.Enrollments;
import web.com.springweb.project.p04_vo.JoinMem;
import web.com.springweb.project.p04_vo.Materials;
import web.com.springweb.project.p04_vo.Withdrawal;


@Controller
public class P_Controller {
	@Autowired(required = false)
	private P_Service service;
	// 초기에 업로드한 경로를 파일다운로드 경로로 설정.
	@Value("${user.upload}")
	private String path;
	// 파일 다운로드
	@GetMapping("download")
	public ResponseEntity<Resource> downloadFile(@RequestParam("filePath") String filePath ) throws IOException{
		// 물리적으로 저장된 파일을 stream형식의 메모리를 만들어 처리함
		// Path : 기존 File객체보다 효과적으로 파일을 처리해주는 객체
		// 다운로드할 파일의 경로로 파일을 설정
		Path fiPath = Paths.get(path).resolve(filePath).normalize();
		// 파일 시스템의 리소스를 생성. 이는 다운로드할 파일을 나타냅니다.
		Resource resource =new FileSystemResource(fiPath);
		// 파일의 존재 여부 확인
		if(!resource.exists()) { // 요청한 파일이 존재하지 않으면 404 Not Found응답을 처리
			return ResponseEntity.notFound().build();
		}
		// 파일 타입 결정 - 파일의 형식(gif, jpg, doc 등 여러 유형에 따른 파일을 전송할 타입을 지정)
		String contentType = Files.probeContentType(fiPath); // IO 발생예외가 나올 때, 웹서버에 전달하여 처리 하도록
		if(contentType==null) {
			contentType="application/octet-stream"; // 8진수 stream 기본 설정하여 파일으로 전송 타입형식 지정
		}
		// throws IOException
		return ResponseEntity.ok()	// HTTP 200 ok 즉, 응답이 정상적으로 처리될 때 처리할 내용
				.contentType(MediaType.parseMediaType(contentType)) // 앞에서 지정한 파일의 Mine 타입을 설정
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; fileName=\""+filePath+"\"") // 다운로드할 파일 지정
				// fileName="실제다운할 파일" fileName=\""+fileName+"\"
				.body(resource); // 마지막으로 다운로드할 파일의 리소스를 응답본문에 설정.
	}
	// 이기찬
	// 비회원 메인페이지
	// http://localhost:7070/pmain
	@RequestMapping("pmain")
	public String main(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
		return "\\WEB-INF\\views\\project\\main.jsp";
	}
	// 회원가입 입력
	// http://localhost:7070/pinsertMem
	@RequestMapping("pinsertMem")
	public String joinMemInsertPost(JoinMem ins, Model d) {
	    if (ins.getMemId() != null) {
	        String result = service.insertJoinMem(ins);
	        if ("등록성공".equals(result)) {
	        	return "redirect:pmain"; // 회원가입 성공 시 main.jsp로 이동
	        } else {
	            d.addAttribute("msg", "회원가입 실패했습니다.");
	            return "\\WEB-INF\\views\\project\\join.jsp"; // 실패 시 다시 join.jsp
	        }
	    }
	    return "WEB-INF\\views\\project\\join.jsp";
	}
	// 아이디 중복확인 ajax
	@RequestMapping("pcheckId")
	@ResponseBody
	public boolean checkId(String memId) {
	    return service.checkId(memId);
	}
	// 로그인
	@GetMapping("plogin")
	public String loginPage() {
	    return "WEB-INF/views/project/login.jsp"; // 로그인 폼으로 이동
	}
	@PostMapping("plogin")
	public String loginProc(JoinMem loginReq, Model d, HttpSession session) {

		JoinMem user = service.selectMember(loginReq);
	    if (user != null) {
	        session.setAttribute("loginUser", user); // 세션에 저장

	        // accountType에 따라 리디렉션
	        String accountType = user.getAccountType();

	        if ("student".equalsIgnoreCase(accountType)) {
	            return "redirect:pstumain";
	        } else if ("admin".equalsIgnoreCase(accountType)) {
	            return "redirect:padminmain";
	        } else if ("teacher".equalsIgnoreCase(accountType)) {
	            return "redirect:pteamain";
	        } else {
	            // 알 수 없는 계정 유형
	            d.addAttribute("loginError", "알 수 없는 계정 유형입니다.");
	            return "WEB-INF\\views\\project\\login.jsp";
	        }

	    } else {
	        // 로그인 실패
	        d.addAttribute("loginError", "아이디 또는 비밀번호가 틀렸습니다.");
	        return "WEB-INF\\views\\project\\login.jsp";
	    }
	}
	// 학생 로그인 메인페이지
	@RequestMapping("pstumain")
	public String stumain(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
	    return "WEB-INF\\views\\project\\stumain.jsp";
	}
	// 관리자 로그인 메인페이지
	@RequestMapping("padminmain")
	public String adminMain(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
	    return "WEB-INF\\views\\project\\adminmain.jsp";
	}
	// 선생님 로그인 메인페이지
	@RequestMapping("pteamain")
	public String teaMain(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
	    return "WEB-INF\\views\\project\\teamain.jsp";
	}
	// 로그 아웃시 세션 삭제 메인페이지로
    @RequestMapping("plogout.do")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 삭제
        return "redirect:pmain"; // 메인 페이지로 리다이렉트
    }
    // 회원리스트(관리자)
	// http://localhost:7070/pgigetMemberList
    @RequestMapping("pgigetMemberList")
    public String pgetMemberList(JoinMem sch, Model d){
		d.addAttribute("memList", service.getMemberList(sch));
		return "WEB-INF\\views\\project\\list.jsp";
    }
	// 회원 디테일
	// http://localhost:7070/gigetMemberDetail
	@GetMapping("pgigetMemberDetail")
	public String pgetMemberDetail(@RequestParam("memPrid") int memPrid, Model d) {
		System.out.println("컨트롤에서 온 memPrid : "+ memPrid);
		d.addAttribute("mem", service.memberById(memPrid));
		return "WEB-INF\\views\\project\\infoList.jsp";
	}
	// 관리자 회원 디테일 수정
	@RequestMapping("pupdateMem")
	public String updateMem(JoinMem upt, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg", service.updateMem(upt));
		return "redirect:pgigetMemberList";
	}
	// 관리자 회원 디테일 삭제
	@RequestMapping("pdeleteMem")
	public String deleteMem(JoinMem del, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg", service.deleteMem(del));
		return "redirect:pgigetMemberList";
	}
	// 학생 회원 디테일 수정
	@RequestMapping("stupdateMem")
	public String stupdateMem(JoinMem upt, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg", service.updateMem(upt));
		return "redirect:stmyPage?memPrid="+ upt.getMemPrid();
	}
	// 학생 회원 탈퇴, 탈퇴 이유, 세션 로그아웃 처리
	@RequestMapping("stdeleteMem")
	public String withdrawMember(
	        @RequestParam("memPrid") int memPrid,
	        @RequestParam("memId") String memId,
	        @RequestParam("memName") String memName,
	        @RequestParam("reason") String reason,
	        RedirectAttributes redirectAttrs,
	        HttpSession session) {
	    // 1. 탈퇴 사유 DB 저장
	    String reasonMsg = service.insertWithdrawal(memPrid, memName, reason); // 성공 메시지 반환
	    // 2. 회원 삭제
	    JoinMem del = new JoinMem();
	    del.setMemId(memId);
	    String deleteMsg = service.deleteMem(del);
	    // 3. 세션 무효화
	    session.invalidate();
	    // 4. 리다이렉트 시 메시지 전달
	    redirectAttrs.addFlashAttribute("withdrawMsg", reasonMsg);
	    redirectAttrs.addFlashAttribute("deleteMsg", deleteMsg);
	    return "redirect:pmain";
	}
	// 강의 목록 페이지(비회원)
	// http://localhost:7070/pmaterialList
	@RequestMapping("pmaterialList")
	public String getMaterialList(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
		return "WEB-INF\\views\\project\\course.jsp";
	}
	
	// 클릭시 강의 목록 가져오기(비회원)
	// http://localhost:7070/pmatDetail
	@RequestMapping("pmatDetail")
	public String matDetail(@RequestParam("materialId") int materialId, Model d) {
		System.out.println("컨트롤에서 온 materialId : "+ materialId);
		d.addAttribute("mat", service.matById(materialId));
		return "WEB-INF\\views\\project\\courseDetail.jsp";
	}
	// 버튼으로 수강 신청 하기
	@RequestMapping("pinsertEnr")
	public String insertEnr(Enrollments ins, RedirectAttributes redirectAttrs) {
		if(ins.getStatus()!=null) {
			redirectAttrs.addFlashAttribute("msg",service.insertEnr(ins));
		}
		return "redirect:pstmatDetail?materialId="+ins.getMaterialsId();
	}
	// http://localhost:7070/pstmaterialList
	// 학생의 강의 목록 페이지
	@RequestMapping("pstmaterialList")
	public String pgetMaterialList(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
		return "WEB-INF\\views\\project\\stcourse.jsp";
	}
	// 클릭시 학생 강의 목록 가져오기
	// 상태에 따라 버튼 구성
	@RequestMapping("pstmatDetail")
	public String matDetail(@RequestParam("materialId") int materialId, HttpSession session, Model d) {
	    // 강의 상세 정보
	    Materials mat = service.matById(materialId);
	    d.addAttribute("mat", mat);

	    // 로그인 사용자 정보 조회
	    JoinMem loginUser = (JoinMem)session.getAttribute("loginUser");
	    if (loginUser != null) {
	        int memPrid = loginUser.getMemPrid();

	        // 강의 수강 상태 조회
	        String status = service.getStatusByMemberAndMaterial(memPrid, materialId);
	        d.addAttribute("status", status); // JSP에서 사용
	    }

	    // 로그인 유무에 상관없이 모두 같은 상세 페이지로 이동
	    return "WEB-INF/views/project/stcourseDetail.jsp";
	}
	// 학생 수강 신청 취소 버튼
	@RequestMapping("pcancelEnr")
	public String deleteEnrollment(Enrollments del, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg",service.deleteEnrollment(del));
		return "redirect:pstmatDetail?materialId="+del.getMaterialsId();
	}
	// 학생 수강 신청 확인
	@RequestMapping("pconfirmEnr")
	public String confirmEnr(HttpSession session, Model d) {
		JoinMem loginUser = (JoinMem) session.getAttribute("loginUser");
	    if (loginUser != null) {
	        int memPrid = loginUser.getMemPrid();
	        List<Enrollments> myEnrollments = service.getEnrollmentsByMember(memPrid);
	        d.addAttribute("myEnrollments", myEnrollments);
	    }
	    return "WEB-INF\\views\\project\\stconfirmEnr.jsp";
	}
	// 관리자 전체 수강 신청 목록 리스트 
	@RequestMapping("penrList")
	public String getEnroll(Enrollments sch, Model d) {
		d.addAttribute("enrList", service.getEnroll(sch));
		return "WEB-INF\\views\\project\\admenrList.jsp";
	}
	// 관리자 수강 신청 상태 수정 버튼
	@ResponseBody
	@PostMapping("ajaxUpdateStatus")
	public Map<String, Object> ajaxUpdateStatus(@RequestParam("enrId") int enrId) {
	    Map<String, Object> result = new HashMap<>();
	    int updated = service.updateEnrollmentStatus(enrId, "신청 완료");

	    result.put("success", updated > 0);
	    result.put("message", updated > 0 ? "신청 완료 처리되었습니다." : "처리에 실패했습니다.");
	    return result;
	}
	
    // 지홍님 파트 (선생님 수업 리스트)
	// http://localhost:7070/pclassRecordList
	@GetMapping("pclassRecordList")
	public String classRecordList(ClassRecord sch, Model d){
		d.addAttribute("classRecordList", service.classRecordList(sch));
		return "WEB-INF\\views\\project\\classRecordList.jsp";
	}
	// http://localhost:7070/pclassRecordInsert
	@RequestMapping("pclassRecordInsert")
	public String insertClassRecord() {
		return "WEB-INF\\views\\project\\classRecord.jsp";
	}
	@PostMapping("pclassRecordInsert")
	public String insertClassRecordPost(ClassRecord ins, Model d) {
		d.addAttribute("msg",service.insertClassRecord(ins));
		return "redirect:pclassRecordList";
	}
	@PostMapping("pclassRecord")
	public String pclassRecordInsertPost(ClassRecord ins, Model d) {
		return "redirect:/pclassRecord";
	}
	@PostMapping("pclassRecordEdit")
	public String classRecordEdit(ClassRecord upt, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg", service.classRecordEdit(upt));
	    return "redirect:/pclassRecordEdit";
	}

	@PostMapping("pclassRecordDelete")
	public String classRecordDelete(@RequestParam("recordId") int recordId) {
	    service.classRecordDelete(recordId);
	    return "redirect:/pclassRecordList";  // classRecordList 경로로 리다이렉트 수정
	}
	@GetMapping("precordDetail")
	public String recordDetail(@RequestParam("recordId") int recordId, Model d) {
	d.addAttribute("r", service.getClassRecord(recordId));
		return "WEB-INF\\views\\project\\classRecordDetail.jsp";
	} 
	@PostMapping("precordUpdate")
	public String recordUpdate(ClassRecord upt, Model d) {
		// 1. 수정 처리..
		d.addAttribute("msg", service.updateClassRecord(upt));
		
		// 2. 수정 후, 상세 모델 데이터 설정..
		d.addAttribute("r", service.getClassRecord(upt.getRecordId()));
		
		return "WEB-INF\\views\\project\\classRecordDetail.jsp";
	}
	
	// 승우님 파트
	// 무료 체험 리스트 보는 곳(관리자와 선생님 로그인에서만 보이게 추가하여야 함)
	// 관리자에서만 보이게
	// http://localhost:7070/pcrList
	@RequestMapping("pcrList")
	public String crList(CounselRequest sch, Model d){
		d.addAttribute("crList", service.crList(sch));
		return "WEB-INF\\views\\project\\crList.jsp";
	}
	// 선생님에서만 보이게
	// http://localhost:7070/ptcrList
	@RequestMapping("ptcrList")
	public String tcrList(CounselRequest sch, Model d){
		d.addAttribute("crList", service.crList(sch));
		return "WEB-INF\\views\\project\\tcrList.jsp";
	}
	// 무료 체엄 신청폼
    // http://localhost:7070/pcrInsert
    @GetMapping("pcrInsert")
	public String crInsert() {
    	return "WEB-INF\\views\\project\\crForm.jsp";
    }
    @PostMapping("pcrInsert")
	public String crInsertPost(CounselRequest ins, Model d) {
		d.addAttribute("msg", service.insertCR(ins));
		
		return "redirect:/pmain";
	}
    // 통계 그래프
    // http://localhost:7070/pgraphJsp
	@GetMapping("pgraphJsp")
    public String pGraphJsp() {
    	return "WEB-INF\\views\\project\\AdGraphs9.jsp";    	   
    } 
    // 명철님 파트
    // 회원리스트(연결을 선생님이랑 관리자로 변경하여야함)
	// http://localhost:7070/pgetMemberList
    @RequestMapping("pgetMemberList")
    public String getMemberList(JoinMem sch, Model d){
		d.addAttribute("memList", service.getMemberList(sch));
		return "WEB-INF\\views\\project\\studentIListex.jsp";
    }
	// 회원 디테일
	// http://localhost:7070/pgetMemberDetail
	@GetMapping("pgetMemberDetail")
	public String getMemberDetail(@RequestParam("memPrid") int memPrid, Model d) {
		System.out.println("컨트롤에서 온 memPrid : "+ memPrid);
		d.addAttribute("mem", service.memberById(memPrid));
		
		return "WEB-INF\\views\\project\\studentInfoList.jsp";
	}
	// 마이페이지 클릭 시 이동
	// http://localhost:7070/stmyPage
	@GetMapping("stmyPage")
	public String getMemberByPrid(@RequestParam("memPrid")int memPrid, Model d) {
		System.out.println("회원 memPrid : "+memPrid);
		d.addAttribute("mem", service.getMemberByPrid(memPrid));
		
		return "WEB-INF\\views\\project\\stmyPage.jsp";
	}
	@RequestMapping("pstmyCourse")
	public String stmyCourse() {
	    return "WEB-INF\\views\\project\\stmyCourse.jsp"; 
	}
	@GetMapping("psubmitPage") 
	public String submitPage() {
		
		return "WEB-INF\\views\\project\\submitPage.jsp";
	}
	
	
	
}
