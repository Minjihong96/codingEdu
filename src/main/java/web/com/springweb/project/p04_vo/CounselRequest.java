package web.com.springweb.project.p04_vo;

import java.util.Date;

public class CounselRequest {
	private String name;
    private String phone;
    private String counselingTime;
    private String department;
    private String message;
    private String regDate;

	public CounselRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CounselRequest(String name, String phone, String counselingTime, String department, String message) {
		super();
		this.name = name;
		this.phone = phone;
		this.counselingTime = counselingTime;
		this.department = department;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCounselingTime() {
		return counselingTime;
	}
	public void setCounselingTime(String counselingTime) {
		this.counselingTime = counselingTime;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
   
}
