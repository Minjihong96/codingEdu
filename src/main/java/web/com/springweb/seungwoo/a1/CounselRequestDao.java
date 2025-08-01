package web.com.springweb.seungwoo.a1;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import web.com.springweb.seungwoo.a1.vo.CounselRequest;
import web.com.springweb.seungwoo.a1.vo.Subject;


@Mapper
public interface CounselRequestDao {
	
	
	
    @Select("SELECT * FROM counsel_request"
    		+ " WHERE NAME LIKE #{name}")
    List<CounselRequest> crList(CounselRequest sch);
    
    @Insert("INSERT INTO counsel_request (name, phone, counseling_time, department, message) "
    		+ "VALUES (#{name}, #{phone}, #{counselingTime}, #{department}, #{message})")
    int insertCR(CounselRequest ins);
    
    @Select("SELECT * FROM Subject WHERE tITLE LIKE #{title}")
    List<Subject> dpList(Subject sch);
    
    
    
  
	
}

