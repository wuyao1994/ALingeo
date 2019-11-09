package com.alingeo.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_order")
public class Order {
	@Id
	@GeneratedValue
	private Long id;
	private String orderPins;
	private String orderLines;
	private String orderWeight;
	private String orderPhone;
	private String orderNumber;
	private String imagePath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderPins() {
		return orderPins;
	}

	public void setOrderPins(String orderPins) {
		this.orderPins = orderPins;
	}

	public String getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(String orderLines) {
		this.orderLines = orderLines;
	}

	public String getOrderWeight() {
		return orderWeight;
	}

	public void setOrderWeight(String orderWeight) {
		this.orderWeight = orderWeight;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
