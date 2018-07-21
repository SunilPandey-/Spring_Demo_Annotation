package com.sunil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		 
		
		//below is for user defined bean id
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		//below is for default bean id
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		// call method on bean
		System.out.println("Tenniss: "+theCoach.getDailyWorkout());
		System.out.println("Tenniss: "+theCoach.getDailyForune());
		
		// close the context
		
		context.close();

	}

}
