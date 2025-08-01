package web.com.springweb.seungwoo.a1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.com.springweb.seungwoo.a1.vo.CounselRequest;
import web.com.springweb.seungwoo.a1.vo.Subject;
@Controller
public class CounselRequestController {
	
    @Autowired(required = false)
	private CounselRequestServiceImpl service;
    


    // http://localhost:7070/crList
    @RequestMapping("crList")
    public String submit(CounselRequest sch, Model d) {

        d.addAttribute("crList", service.crList(sch));
        return "WEB-INF\\views\\seungwoo\\crList.jsp"; // 다시 form 페이지로 가거나 성공 페이지로 전환
    }
    
    // http://localhost:7070/crInsert
    @GetMapping("crInsert")
	public String crInsert() {
		
		return "WEB-INF\\views\\seungwoo\\crForm.jsp";
	}
    
    
    // http://localhost:7070/crInsert
	@PostMapping("crInsert")
	public String crInsertPost(CounselRequest ins, Model d) {
		d.addAttribute("msg", service.insertCR(ins));
		
		return "redirect:/crList";
	}
		
	@GetMapping("login")
	public String login() { // 요청값.
		// 모델 데이터 설정
		// view단 호출..
		return "WEB-INF\\\\views\\\\seungwoo\\\\login.jsp";
	}
	
	@GetMapping("404")
	public String a404() { // 요청값.
		// 모델 데이터 설정
		// view단 호출..
		return "WEB-INF\\\\views\\\\seungwoo\\\\404.jsp";
	}
	
	@RequestMapping("development")
	public String development(Subject sch, Model d) { // 요청값.
		// 모델 데이터 설정
		// view단 호출..
		d.addAttribute("dpList", service.dpList(sch));
		return "WEB-INF\\\\views\\\\seungwoo\\\\development.jsp";
	}
	
	@GetMapping("development2")
	public String development2() {
		
		return "WEB-INF\\views\\seungwoo\\index.html";
	}
	
	
    
	
	
	
   
}
