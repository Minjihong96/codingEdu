package web.com.springweb.gichan.gi01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import web.com.springweb.gichan.gi02_service.Join_MembershipService;
import web.com.springweb.gichan.gi04_vo.Enrollments;
import web.com.springweb.gichan.gi04_vo.JoinMem;
import web.com.springweb.gichan.gi04_vo.Materials;

@Controller
public class Join_MembershipController {
	@Autowired(required = false)
	private Join_MembershipService service;
	
	// http://localhost:7070/main
	// 강의 목록도 같이 열리게 추가(프로젝트에도 추가하기)
	@RequestMapping("main")
	public String main(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
		return "\\WEB-INF\\views\\gichan\\main.jsp";
	}
	
	// http://localhost:7070/insertMem
	@RequestMapping("insertMem")
	public String joinMemInsertPost(JoinMem ins, Model d) {
	    if (ins.getMemId() != null) {
	        String result = service.insertJoinMem(ins);
	        if ("등록성공".equals(result)) {
	        	return "redirect:main"; // 회원가입 성공 시 main.jsp로 이동
	        } else {
	            d.addAttribute("msg", "회원가입 실패했습니다.");
	            return "\\WEB-INF\\views\\gichan\\join.jsp"; // 실패 시 다시 join.jsp
	        }
	    }
	    return "WEB-INF\\views\\gichan\\join.jsp";
	}
	
	@RequestMapping("checkId")
	@ResponseBody
	public boolean checkId(String memId) {
	    return service.checkId(memId);
	}
	
	@GetMapping("gilogin")
	public String loginPage() {
	    return "WEB-INF/views/gichan/login.jsp"; // 로그인 폼으로 이동
	}
	@PostMapping("gilogin")
	public String loginProc(JoinMem loginReq, Model d, HttpSession session) {

		JoinMem user = service.selectMember(loginReq);
	    if (user != null) {
	        session.setAttribute("loginUser", user); // 세션에 저장

	        // accountType에 따라 리디렉션
	        String accountType = user.getAccountType();

	        if ("student".equalsIgnoreCase(accountType)) {
	            return "redirect:stumain";
	        } else if ("admin".equalsIgnoreCase(accountType)) {
	            return "redirect:adminmain";
	        } else if ("teacher".equalsIgnoreCase(accountType)) {
	            return "redirect:teamain";
	        } else {
	            // 알 수 없는 계정 유형
	            d.addAttribute("loginError", "알 수 없는 계정 유형입니다.");
	            return "WEB-INF\\views\\gichan\\login.jsp";
	        }

	    } else {
	        // 로그인 실패
	        d.addAttribute("loginError", "아이디 또는 비밀번호가 틀렸습니다.");
	        return "WEB-INF\\views\\gichan\\login.jsp";
	    }
	}
	@RequestMapping("stumain")
	public String stumain() {
	    return "WEB-INF\\views\\gichan\\stumain.jsp";
	}
	@RequestMapping("adminmain")
	public String adminMain() {
	    return "WEB-INF\\views\\gichan\\adminmain.jsp";
	}
	@RequestMapping("teamain")
	public String teaMain() {
	    return "WEB-INF\\views\\gichan\\teamain.jsp";
	}
	
    @RequestMapping("logout.do")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 삭제
        return "redirect:main"; // 메인 페이지로 리다이렉트
    }
    
    
    // 회원리스트(연결을 선생님이랑 관리자로 변경하여야함)
	// http://localhost:7070/gigetMemberList
    @RequestMapping("gigetMemberList")
    public String getMemberList(JoinMem sch, Model d){
		d.addAttribute("memList", service.getMemberList(sch));
		return "WEB-INF\\views\\gichan\\list.jsp";
    }
	// 회원 디테일
	// http://localhost:7070/gigetMemberDetail
	@GetMapping("gigetMemberDetail")
	public String getMemberDetail(@RequestParam("memPrid") int memPrid, Model d) {
		System.out.println("컨트롤에서 온 memPrid : "+ memPrid);
		d.addAttribute("mem", service.memberById(memPrid));
		
		return "WEB-INF\\views\\gichan\\infoList.jsp";
	}
	// 관리자 회원 디테일 수정
	@RequestMapping("updateMem")
	public String updateMem(JoinMem upt, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg", service.updateMem(upt));
		return "redirect:gigetMemberList";
	}
	// 관리자 회원 디테일 삭제
	@RequestMapping("deleteMem")
	public String deleteMem(JoinMem upt, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("msg", service.deleteMem(upt));
		return "redirect:gigetMemberList";
	}
	
	
	// http://localhost:7070/MaterialList
	// 강의 목록 페이지
	@RequestMapping("MaterialList")
	public String getMaterialList(Materials sch, Model d) {
		d.addAttribute("matList", service.getMaterialList(sch));
		return "WEB-INF\\views\\gichan\\course.jsp";
	}
	
	// 클릭시 강의 목록 가져오기
	// http://localhost:7070/matDetail
	@RequestMapping("matDetail")
	public String matDetail(@RequestParam("materialId") int materialId, Model d) {
		System.out.println("컨트롤에서 온 materialId : "+ materialId);
		d.addAttribute("mat", service.matById(materialId));
		return "WEB-INF\\views\\gichan\\courseDetail.jsp";
	}
	// 버튼으로 넘길 수강 신청 확인
	@RequestMapping("insertEnr")
	public String insertEnr(Enrollments ins, Model d) {
		if(ins.getStatus()!=null) {
			d.addAttribute("msg",service.insertEnr(ins));
		}
		return "WEB-INF\\views\\gichan\\courseDetail.jsp";
	}
}
