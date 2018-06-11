package com.alingeo.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_center")
public class Center {
	@Id
	@GeneratedValue
	private Long	id;
	private String	name;
	private String	telephone;
	private String	address;
	private String	iamgePath;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getIamgePath() {
		return iamgePath;
	}



	public void setIamgePath(String iamgePath) {
		this.iamgePath = iamgePath;
	}
}
