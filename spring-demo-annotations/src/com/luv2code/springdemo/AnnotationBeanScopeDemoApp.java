package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// check TennisCoach
		boolean result = theCoach == alphaCoach;
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("Momory location for theCoach: " + theCoach);
		System.out.println("Momory location for alphaCoach: " + alphaCoach);
		
		// check fortuneService
		boolean result2 = theCoach.fortuneService == alphaCoach.fortuneService;
		System.out.println("\nPointing to the same object: " + result2);
		System.out.println("Momory location for theCoach: " + theCoach.fortuneService);
		System.out.println("Momory location for alphaCoach: " + alphaCoach.fortuneService);
		
		// preDestroy & Close
		System.out.println("\npreDestroy & Close");
		context.close();
	}

}
