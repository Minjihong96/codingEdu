package web.com.springweb.seungwoo.a2;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import web.com.springweb.project.p04_vo.ClassRecord;
import web.com.springweb.seungwoo.a1.vo.CounselRequest;
import web.com.springweb.vo.CounselRequest2;

@Service
public class CounselRequestService2 {

	@Autowired(required=false)
	private CounselRequestDao2 dao;
	

	public List<CounselRequest> getCR(CounselRequest sch) {
		// 초기화면에서 null 시, "" 처리
		
		if(sch.getName() == null) sch.setName("");

		sch.setName("%" + sch.getName() + "%");
		
		return dao.getCR(sch);
	}
	

	 public List<CounselRequest2> getGrCount() {
	        return dao.getNo();
	    }
	 //그래프 서비스
    
	 public ClassRecord getClassRecord(int recordId) {
			return dao.getClassRecord(recordId);
		}
	 
	 public String updateClassRecord(ClassRecord upt) {
			return dao.updateClassRecord(upt)>0?"수정성공":"수정실패";
		}
		
    
    
    
    
    
}