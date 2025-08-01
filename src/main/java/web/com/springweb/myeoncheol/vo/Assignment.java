package web.com.springweb.myeoncheol.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class Assignment {
	
	private int assignmentId;
	private int materialId;
	private String title;
	private String content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dueDate;
	private List<MultipartFile> attachment;
	
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assignment(int assignmentId, int materialId, String title, String content, Date dueDate) {
		super();
		this.assignmentId = assignmentId;
		this.materialId = materialId;
		this.title = title;
		this.content = content;
		this.dueDate = dueDate;
	}
	public int getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public List<MultipartFile> getAttachment() {
		return attachment;
	}
	public void setAttachment(List<MultipartFile> attachment) {
		this.attachment = attachment;
	}

	
	
	

}
