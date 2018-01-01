package com.et;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.et.dao.Food;

public class Test {
	public static void main(String[] args) {
//		add();
//		delete();
		query();
	}
	public static void add() {
		Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
		Food food = new Food();
		food.setFoodname("aa");
		food.setPrice(100.0);
		food.setImgpath("e:");
		session.save(food);
		session.getTransaction().commit();
	}
	public static void query() {
		Session session = HibernateSessionFactory.getSession();
//		session.getTransaction().begin();
//		Food food =(Food) session.load(Food.class, 1);
//		System.out.println(food.getFoodname());
		Query query = session.createQuery("from Food where foodname like :xxx");
		query.setString("xxx", "%°×%");
		List<Food>foods = query.list();
		for (Food f : foods) {
			System.out.println(f.getFoodname()+"--"+f.getPrice());
		}
	}
	public static void delete() {
		Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
		Food food = new Food();
		food.setFoodid(14);
		
		session.delete(food);
		
		session.getTransaction().commit();
	}
	public static void updata() {
		Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
		Food food = new Food();
		food.setFoodname("aa");
		food.setPrice(100.0);
		food.setImgpath("e:");
		session.save(food);
		session.getTransaction().commit();
	}
}
