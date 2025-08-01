package web.com.springweb.seungwoo.a2;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import web.com.springweb.project.p04_vo.ClassRecord;
import web.com.springweb.seungwoo.a1.vo.CounselRequest;
import web.com.springweb.vo.CounselRequest2;

@Controller
public class CounselRequestController2 {
	
    @Autowired(required = false)
	private CounselRequestService2 service;
    

    @GetMapping("getCR")
	public ResponseEntity<?> getCR(CounselRequest sch){
		return ResponseEntity.ok(service.getCR(sch));
	}
    
    @GetMapping("crList2")
    public String crList2() {
    	return "seungwoo\\crList.html";
    	
    	
    }	
   
    @GetMapping("AdGraphs")
    public String AdGraphs() {
    	return "seungwoo\\AdGraphs6.html";    
    }
    // 그래프 페이지
    // 경로 : src\main\resources\static\seungwoo\AdGraphs6.html
    
    
    
    @GetMapping("/grCount")
    @ResponseBody  
    public List<CounselRequest2> grCount() {
        return service.getGrCount();
    }
    //갯수 받아와서 JSON 으로 변환 하는거
    
    
    
    
    
	@GetMapping("recordDetail")
		public String recordDetail(@RequestParam("recordId") int recordId, Model d) {
		d.addAttribute("r", service.getClassRecord(recordId));
			return "WEB-INF\\views\\seungwoo\\classRecordDetail.jsp";
		} 
	
	
	
	@PostMapping("recordUpdate")
	public String recordUpdate(ClassRecord upt, Model d) {
		// 1. 수정 처리..
		d.addAttribute("msg", service.updateClassRecord(upt));
		
		// 2. 수정 후, 상세 모델 데이터 설정..
		d.addAttribute("r", service.getClassRecord(upt.getRecordId()));
		
		return "WEB-INF\\views\\seungwoo\\classRecordDetail.jsp";
	}
    	
	@GetMapping("graphJsp")
    public String GraphJsp() {
    	return "WEB-INF\\views\\seungwoo\\AdGraphs9.jsp";    	   
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
