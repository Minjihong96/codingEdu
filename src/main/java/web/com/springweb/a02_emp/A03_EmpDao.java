package web.com.springweb.a02_emp;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import web.com.springweb.a02_emp.vo.Emp;

@Mapper
public interface A03_EmpDao {
	@Select("SELECT * FROM EMP WHERE ENAME LIKE #{ename} AND JOB LIKE #{job} ORDER BY EMPNO")
	List<Emp> empList(Emp sch);  // public 생략..
}
