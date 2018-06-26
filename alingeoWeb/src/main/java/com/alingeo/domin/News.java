package com.alingeo.domin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_news")
public class News {
	@Id
	@GeneratedValue
	private Long	id;
	private String	title;
	private Date	date;
	private String	brief;
	private String	content1;
	private String	content2;
	private String	type;
	private String	imagePath;
	private String	imageTitle;
	private int		year;
	private int		month;
	private int		day;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getBrief() {
		return brief;
	}



	public void setBrief(String brief) {
		this.brief = brief;
	}



	public String getContent1() {
		return content1;
	}



	public void setContent1(String content1) {
		this.content1 = content1;
	}



	public String getContent2() {
		return content2;
	}



	public void setContent2(String content2) {
		this.content2 = content2;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getImagePath() {
		return imagePath;
	}



	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}



	public String getImageTitle() {
		return imageTitle;
	}



	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}
}
