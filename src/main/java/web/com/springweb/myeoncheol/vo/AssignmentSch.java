package web.com.springweb.myeoncheol.vo;

public class AssignmentSch {
	
	private String title;
	private String content;
	public AssignmentSch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignmentSch(String title, String content) {
		super();
		this.title = title;
		this.content = content;
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
	

}
