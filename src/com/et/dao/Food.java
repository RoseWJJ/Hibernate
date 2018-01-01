package com.et.dao;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */
public class Food extends AbstractFood implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Food() {
	}

	/** full constructor */
	public Food(String foodname, Double price, String imgpath) {
		super(foodname, price, imgpath);
	}

}
