package web.com.springweb.myeoncheol.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class Submission {
	private int submissionId; 
	private int memPrid;
	private int assignmentId;
	private String content;
	private String attachment;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date submitDate;
    private MultipartFile report; // setAttachment(report.getOriginalFileName())

	public Submission() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Submission(int submissionId, int memPrid, int assignmentId, String content, String attachment,
			Date submitDate) {
		super();
		this.submissionId = submissionId;
		this.memPrid = memPrid;
		this.assignmentId = assignmentId;
		this.content = content;
		this.attachment = attachment;
		this.submitDate = submitDate;
	}
	public int getSubmissionId() {
		return submissionId;
	}
	public void setSubmissionId(int submissionId) {
		this.submissionId = submissionId;
	}
	public int getMemPrid() {
		return memPrid;
	}
	public void setMemPrid(int memPrid) {
		this.memPrid = memPrid;
	}
	public int getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}


	public MultipartFile getReport() {
		return report;
	}


	public void setReport(MultipartFile report) {
		this.report = report;
	}
	
	
	

}
