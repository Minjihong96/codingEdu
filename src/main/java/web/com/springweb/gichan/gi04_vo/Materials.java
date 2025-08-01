package web.com.springweb.gichan.gi04_vo;

import java.util.Date;

public class Materials {
	private int materialId;
	private String title;
	private String materialsImg;
	private String description;
	private String filePath;
	private Date uploadDate;
	private int price;
	private String difficulty;
	private int duration;
	private String lectures;
	private int memPrid;
	public Materials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Materials(int materialId, String title, String materialsImg, String description, String filePath,
			Date uploadDate, int price, String difficulty, int duration, String lectures, int memPrid) {
		super();
		this.materialId = materialId;
		this.title = title;
		this.materialsImg = materialsImg;
		this.description = description;
		this.filePath = filePath;
		this.uploadDate = uploadDate;
		this.price = price;
		this.difficulty = difficulty;
		this.duration = duration;
		this.lectures = lectures;
		this.memPrid = memPrid;
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
	public String getMaterialsImg() {
		return materialsImg;
	}
	public void setMaterialsImg(String materialsImg) {
		this.materialsImg = materialsImg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getLectures() {
		return lectures;
	}
	public void setLectures(String lectures) {
		this.lectures = lectures;
	}
	public int getMemPrid() {
		return memPrid;
	}
	public void setMemPrid(int memPrid) {
		this.memPrid = memPrid;
	}
	
}
