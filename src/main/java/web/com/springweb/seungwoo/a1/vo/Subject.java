package web.com.springweb.seungwoo.a1.vo;

public class Subject {
	
	private int subjectId;        // 강의 고유 코드
	private String title;         // 강의 제목
	private String subtitle;      // 강의 부제목
	private String imageUrl;      // 강의 이미지 URL
	private int memPrid;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectId, String title, String subtitle, String imageUrl, int memPrid) {
		super();
		this.subjectId = subjectId;
		this.title = title;
		this.subtitle = subtitle;
		this.imageUrl = imageUrl;
		this.memPrid = memPrid;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getMemPrid() {
		return memPrid;
	}

	public void setMemPrid(int memPrid) {
		this.memPrid = memPrid;
	}      
		
}