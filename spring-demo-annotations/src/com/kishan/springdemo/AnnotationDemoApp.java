package com.kishan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		//Read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		//Get the bean from spring container
		Coach theCoach= context.getBean("thatSillyCoach",Coach.class);
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//Close the container
		context.close();
	}
}
