package web.com.springweb.seungwoo.a2;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import web.com.springweb.project.p04_vo.ClassRecord;
import web.com.springweb.seungwoo.a1.vo.CounselRequest;
import web.com.springweb.vo.CounselRequest2;




@Mapper
public interface CounselRequestDao2 {

	@Select("SELECT name, phone, counseling_time, department, message, reg_date " +
	        "FROM counsel_request " +
	        "WHERE name LIKE #{name}")
	List<CounselRequest> getCR(CounselRequest sch);
	
	
	@Select("SELECT department, COUNT(*) AS cnt FROM counsel_request GROUP BY department ORDER BY department")
	List<CounselRequest2> getNo();
	
	
	
	@Select("SELECT * FROM Class_Record WHERE record_ID = #{recordId}")
	ClassRecord getClassRecord(@Param("recordId") int recordId);
	
	@Update("UPDATE class_record SET CLASS_DATE = #{classDate, jdbcType=DATE}, CLASS_CONTENTS = #{classContents}, SUBJECT = #{subject}, SESSION_NUMBER = #{sessionNumber}, PAYMENT = #{payment}, ETC = #{etc} WHERE RECORD_ID = #{recordId}")
	int updateClassRecord(ClassRecord upt);
	
	
	
	
	
	
}

