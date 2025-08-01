package web.com.springweb.myeoncheol.smc01.a01_java;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import web.com.springweb.gichan.gi04_vo.JoinMem;
import web.com.springweb.myeoncheol.vo.Assignment;
import web.com.springweb.myeoncheol.vo.JoinMembership;
import web.com.springweb.myeoncheol.vo.Submission;


@Controller
public class Controllerclass {
	
	@Autowired(required = false)
	private Serviceclass service;
	
	// http://localhost:7070/mcStart3
	@RequestMapping("mcStart3")
	public String mcStart3() {
		return "WEB-INF\\views\\myoungcheol\\submitPage.jsp";
	}
	
	// http://localhost:7070/mcmain
		@RequestMapping("mcmain")
		public String mcmain() {
			return "WEB-INF\\views\\myoungcheol\\mcmain.jsp";
		}
		

	// http://localhost:7070/mclogin
	@GetMapping("mclogin")
	public String mclogin() {
	    return "WEB-INF\\views\\myoungcheol\\mclogin.jsp"; // 로그인 폼으로 이동
	}
	@PostMapping("mclogin")
	public String loginProc(JoinMem loginReq, Model d, HttpSession session) {

		JoinMem user = service.selectMember(loginReq);
	    if (user != null) {
	        session.setAttribute("loginUser", user); // 세션에 저장

	        // accountType에 따라 리디렉션
	        String accountType = user.getAccountType();

	        if ("student".equalsIgnoreCase(accountType)) {
	            return "redirect:stumainmc"; // ✔ 자동으로 위 메서드 호출
	        } else if ("admin".equalsIgnoreCase(accountType)) {
	            return "redirect:adminmainmc";
	        } else if ("teacher".equalsIgnoreCase(accountType)) {
	            return "redirect:teamainmc";
	        } else {
	            // 알 수 없는 계정 유형
	            d.addAttribute("loginError", "알 수 없는 계정 유형입니다.");
	            return "WEB-INF\\views\\myoungcheol\\mcmain.jsp";
	        }

	    } else {
	        // 로그인 실패
	        d.addAttribute("loginError", "아이디 또는 비밀번호가 틀렸습니다.");
	        return "WEB-INF\\views\\myoungcheol\\mcmain.jsp";
	    }
	}
	
	@RequestMapping("stumainmc")
	public String stumainmc() {
	    return "\\WEB-INF\\views\\myoungcheol\\stumainmc.jsp"; // 자동으로 /WEB-INF/views/myoungcheol/stumainmc.jsp 렌더링
	}
	@RequestMapping("adminmainmc")
	public String adminmainmc() {
	    return "WEB-INF\\views\\myoungcheol\\adminmainmc.jsp";
	}
	@RequestMapping("teamainmc")
	public String teamainmc() {
	    return "EB-INF\\views\\myoungcheol\\teamainmc.jsp";
	}
	// mcmain 파일로
    @RequestMapping("logoutmc")
    public String logoutmc(HttpSession session) {
    	
        session.invalidate(); // 세션 삭제
        return "redirect:mcmain"; // 메인 페이지로 리다이렉트
    }
    

    // 강의 상세 페이지 - 0627 추가
    // http://localhost:7070/courseDet
    @GetMapping("courseDet")
    public String courseDet() {
    	return "WEB-INF\\views\\myoungcheol\\stcourceDetail.jsp";
    }
    	

    
		
		
		
		// http://localhost:7070/checkInfo
		@RequestMapping("checkInfo")
		public String checkInfo() {
			return "WEB-INF\\views\\myoungcheol\\studentInfoList.jsp";
		}
			// 회원 리스트
			// http://localhost:7070/getMemberList
		@RequestMapping("getMemberList")
		public String getMemberList(JoinMembership sch, Model d){
			d.addAttribute("memList", service.getMemberList(sch));			
			return "WEB-INF\\views\\myoungcheol\\studentIListex.jsp";
		}
	
		// 회원 디테일
		// http://localhost:7070/getMemberDetail?memPrid=45
		@GetMapping("getMemberDetail")
		public String getMemberDetail(@RequestParam("memPrid")int memPrid, Model d) {
			System.out.println("확인된 memPrid : "+ memPrid);
			d.addAttribute("mem", service.memberById(memPrid));		
			return "WEB-INF\\views\\myoungcheol\\studentInfoList.jsp";
		}
		


		
		// http://localhost:7070/mypage?memPrid=45
		@RequestMapping("mypage")
	    public String mypage(@RequestParam("memPrid") int memPrid, Model d) {
			 if (memPrid == 0) {
			        d.addAttribute("errorMsg", "조회할 회원 번호가 없습니다.");
			        return "WEB-INF\\views\\myoungcheol\\stMyInfoList.jsp";
			    }
			
			d.addAttribute("mem", service.memberById(memPrid));
	        
	        return "WEB-INF/views/myoungcheol/studentInfoList.jsp";
	    }
		

		// 마이페이지 클릭 시 이동
		// http://localhost:7070/stmyPage2
		@GetMapping("stmyPage2")
		public String stmyPage2() {
			return "WEB-INF\\views\\myoungcheol\\stmyPage2.jsp";
		}
		

		@RequestMapping("stmyCourse")
		public String stmyCourse() {
		    return "WEB-INF/views/myoungcheol/stmyCourse.jsp"; // /WEB-INF/views/myoungcheol/stmyCourse.jsp
		}
		

		
		// http://localhost:7070/stMyInfoList?memPrid=45
		@GetMapping("stMyInfoList")
		public String stMyInfoList(@RequestParam("memPrid")int memPrid, Model d) {
			System.out.println("컨트롤에서 온 memPrid : "+ memPrid);
			d.addAttribute("mem", service.memberById(memPrid));
			
			return "WEB-INF\\views\\myoungcheol\\stMyInfoList.jsp";
		}
		
		// 학생 디테일 수정
		@PostMapping("updateSt")
		public String updateSt(JoinMem upt, RedirectAttributes redirectAttrs) {
			redirectAttrs.addFlashAttribute("msg", service.updateSt(upt));
			return "redirect:stmyPage2";
		}
		
		// 회원 탈퇴
		// http://localhost:7070/deleteSt
		@RequestMapping("deleteSt")
		public String deleteSt(JoinMem del, HttpSession session, RedirectAttributes redirectAttrs) {
			String result = service.deleteSt(del);
			session.invalidate();
			redirectAttrs.addFlashAttribute("msg", result);
			return "redirect:mcmain";
		}
		

		// 0701 추가 회원 본인 이름/아이디
		// http://localhost:7070/getMemberByPrid?memPrid=45
		// href="${pageContext.request.contextPath}
		// /stMyInfoList?memPrid=${sessionScope.loginUser.memPrid}">마이페이지</a>
		// 마이페이지, 학생 메인페이지 등등 네비게이션 바에 마이페이지 속성 변경했습니다.
		@GetMapping("getMemberByPrid")
		public String getMemberByPrid(@RequestParam("memPrid")int memPrid, Model d) {
			System.out.println("회원 memPrid : "+memPrid);
			d.addAttribute("mem", service.getMemberByPrid(memPrid));
			
			return "WEB-INF\\views\\myoungcheol\\stmyPage2.jsp";
		}
		
		// http://localhost:7070/submitPage
		@RequestMapping("submitPage") 
		public String submitPage() {
			
			return "WEB-INF\\views\\myoungcheol\\submitPage.jsp";
		}
		// 0701 추가부분
    	// 과제제출 페이지입니다
    	// 흐름 : 마이페이지 - 수강목록 - 강의 상세페이지 - 과제 목록 - 과제제출 버튼
		// http://localhost:7070/insertSubmission
		@RequestMapping("insertSubmission") 
		public String insertSubmission(Submission ins, Model d) {
			
			if(ins.getContent()!=null) {
			d.addAttribute("msg",service.insertSubmission(ins));
			}
			return "WEB-INF\\views\\myoungcheol\\submitPage.jsp";
		}
		// 06 27 추가부분
		// 강의에 따른 과제목록입니다. materialId = 4 가 결과값이 가장 많습니다
		// AssignmentList.jsp 페이지에 materialId 받을 수 있는 구문 주석처리되어있습니다.
		// http://localhost:7070/getAssignment?materialId=4
		@RequestMapping("getAssignment") //name="MaterialId", defaultValue="0"
		public String getAssignment(@RequestParam("materialId")int materialId, Model d) {
			System.out.println("컨트롤에서 온 materialiId : "+ materialId);
			d.addAttribute("asg", service.getAssignment(materialId));
				return "WEB-INF\\views\\myoungcheol\\AssignmentList.jsp";
		}
		
		
		// 06 30 추가
		// 과제조회
		// memPrid값을 전달받아야 보이는 페이지입니다.
		// http://localhost:7070/getAssignmentId?materialId=28
		@GetMapping("getAssignmentId")
		public String getAssignmentId(Assignment sch, Model d) {
			
			d.addAttribute("alist", service.getAssignmentId(sch));
			return "WEB-INF\\views\\myoungcheol\\AssignmentList.jsp";
		}

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
