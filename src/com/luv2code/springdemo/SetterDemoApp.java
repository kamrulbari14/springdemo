package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from sprig container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//using methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//let's call our new methods for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
