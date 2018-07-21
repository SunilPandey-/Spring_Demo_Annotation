package com.sunil.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "RESTFortuneService is your lucky day!";
	}

}
