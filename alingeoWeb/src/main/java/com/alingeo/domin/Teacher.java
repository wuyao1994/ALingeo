package com.alingeo.domin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_teacher")
public class Teacher {
	@Id
	@GeneratedValue
	private Long	id;
	private String	chineseName;
	private String	englishName;
	private Date	joinTime;
	private String	serviceCenter;
	private String	introduce;
	private String	imagePath;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getChineseName() {
		return chineseName;
	}



	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}



	public String getEnglishName() {
		return englishName;
	}



	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}



	public Date getJoinTime() {
		return joinTime;
	}



	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}



	public String getServiceCenter() {
		return serviceCenter;
	}



	public void setServiceCenter(String serviceCenter) {
		this.serviceCenter = serviceCenter;
	}



	public String getIntroduce() {
		return introduce;
	}



	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}



	public String getImagePath() {
		return imagePath;
	}



	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
