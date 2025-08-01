package web.com.springweb.seungwoo.a1;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.com.springweb.seungwoo.a1.vo.CounselRequest;
import web.com.springweb.seungwoo.a1.vo.Subject;

import web.com.springweb.seungwoo.a1.CounselRequestDao;

@Service
public class CounselRequestServiceImpl {

	@Autowired(required=false)
	private CounselRequestDao dao;
	


    public List<CounselRequest> crList(CounselRequest sch){
		if(sch.getName()==null) sch.setName("");
		sch.setName("%"+sch.getName()+"%");	
		return dao.crList(sch);
	} 
    
    public String insertCR(CounselRequest ins) {
		// 등록되면 row단위로 리턴..
    	return dao.insertCR(ins)>0?"등록성공":"등록실패";
    }
    
    public List<Subject> dpList(Subject sch) {
        if(sch.getTitle() == null) sch.setTitle("");
        sch.setTitle("%" + sch.getTitle() + "%");
        return dao.dpList(sch);
    }
    
    
    
 
    
    
    
    
    
    
    
}