package com.sunil.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// below is user defined bean id
//@Component("thatSillyCoach")
// below is default bean id
@Component

public class TennisCoach implements Coach {
	
	// enable @Autowired for field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// constructor dependency injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	// default constructor for setter injection  
	public TennisCoach() {}
	
	// Define a setter method for injection 
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach -> Inside setter method - setFortuneService ");
		this.fortuneService = fortuneService;
	}*/
	
	
	// custom method for injection
	/*@Autowired
	public void doSomeCrazzyStuff(FortuneService fortuneService){
		System.out.println("TennisCoach -> Inside custom method - doSomeCrazzyStuff ");
		this.fortuneService = fortuneService;
	}*/
	
	
	@Override
	public String getDailyWorkout() {

		return "Practise your back hand volley";
	}

	

	@Override
	public String getDailyForune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
