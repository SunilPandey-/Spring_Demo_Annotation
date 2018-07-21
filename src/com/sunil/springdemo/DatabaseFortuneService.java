package com.sunil.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "DatabaseFortuneService is your lucky day!";
	}

}
