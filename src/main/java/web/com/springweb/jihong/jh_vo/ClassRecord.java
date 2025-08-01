package web.com.springweb.jihong.jh_vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ClassRecord {
	private int recordId;
	private String memName;
	private int memPrid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date classDate;
	private String classContents;
	private String subject;
	private int sessionNumber;
	private int payment;
	private String etc;
	private int cirdSeq;
	public ClassRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ClassRecord(int recordId, String memName, int memPrid, Date classDate, String classContents, String subject,
			int sessionNumber, int payment, String etc, int cirdSeq) {
		super();
		this.recordId = recordId;
		this.memName = memName;
		this.memPrid = memPrid;
		this.classDate = classDate;
		this.classContents = classContents;
		this.subject = subject;
		this.sessionNumber = sessionNumber;
		this.payment = payment;
		this.etc = etc;
		this.cirdSeq = cirdSeq;
	}


	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	
	public String getMemName() {
		return memName;
	}


	public void setMemName(String memName) {
		this.memName = memName;
	}


	public int getMemPrid() {
		return memPrid;
	}
	public void setMemPrid(int memPrid) {
		this.memPrid = memPrid;
	}
	public Date getClassDate() {
		return classDate;
	}
	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}
	public String getClassContents() {
		return classContents;
	}
	public void setClassContents(String classContents) {
		this.classContents = classContents;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSessionNumber() {
		return sessionNumber;
	}
	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public int getCirdSeq() {
		return cirdSeq;
	}
	public void setCirdSeq(int cirdSeq) {
		this.cirdSeq = cirdSeq;
	}
	
}
