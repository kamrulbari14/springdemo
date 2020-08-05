package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//defining Init method
	public void myBeanStartup() {
		System.out.println("TrackCoach: Showing the init-method");
	}
	
	//defining Destroy method
	public void myBeanClosing() {
		System.out.println("TrackCoach: Showing the destroy method");
	}

}
