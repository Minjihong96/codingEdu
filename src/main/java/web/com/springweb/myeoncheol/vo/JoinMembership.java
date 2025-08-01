package web.com.springweb.myeoncheol.vo;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class JoinMembership {
    private int memPrid;
    private String memId;
    private String memPwd;
    private String memName;
    private String memPhone;
    private String memEmail;
    private String memAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date memBirthday;
    private String accountType;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Timestamp updatedAt;
    
	public JoinMembership() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JoinMembership(int memPrid, String memId, String memPwd, String memName, String memPhone, String memEmail,
			String memAddress, Date memBirthday, String accountType, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.memPrid = memPrid;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memEmail = memEmail;
		this.memAddress = memAddress;
		this.memBirthday = memBirthday;
		this.accountType = accountType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public JoinMembership(int memPrid, String memId, String memPwd, String memName, String memPhone, String memEmail,
			String memAddress, Date memBirthday, String accountType) {
		super();
		this.memPrid = memPrid;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memEmail = memEmail;
		this.memAddress = memAddress;
		this.memBirthday = memBirthday;
		this.accountType = accountType;
	}
	public int getMemPrid() {
		return memPrid;
	}
	public void setMemPrid(int memPrid) {
		this.memPrid = memPrid;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemAddress() {
		return memAddress;
	}
	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
	public Date getMemBirthday() {
		return memBirthday;
	}
	public void setMemBirthday(Date memBirthday) {
		this.memBirthday = memBirthday;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}    
}
