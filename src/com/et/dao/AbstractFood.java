package com.et.dao;

/**
 * AbstractFood entity provides the base persistence definition of the Food
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFood implements java.io.Serializable {

	// Fields

	private Integer foodid;
	private String foodname;
	private Double price;
	private String imgpath;

	// Constructors

	/** default constructor */
	public AbstractFood() {
	}

	/** full constructor */
	public AbstractFood(String foodname, Double price, String imgpath) {
		this.foodname = foodname;
		this.price = price;
		this.imgpath = imgpath;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgpath() {
		return this.imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}

}