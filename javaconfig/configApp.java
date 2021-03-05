package com.ncu.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.ncu.javaconfig")
public class configApp {

	//<bean id="" class=" ">
	//Component("id_name")
	//java config object of any bean
	@Bean
	public IFortune fortune() {
		return new Fortune();
	}
	
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(fortune());
	}
	@Bean
	public CricketCoach ccoach() {
		return new CricketCoach(fortune());
	}
}
