package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean form spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//comparing between two objects
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("\nPrinting the result= " + result);
		System.out.println("\nPrinting theCoach: " + theCoach);
		System.out.println("\nPrinting alphaCoach " + alphaCoach + "\n");
		
		//closing the context
		context.close();

	}

}
