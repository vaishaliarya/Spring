package JavaConfigDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("JavaConfigDemo")

public class ConfigBean {

	//define bean for fortune class
	@Bean
	public IFortune happyFortune() {
		return new HappyFortune();
	}
	
	//Define Bean for Cricket coach and do the injection of hppyfortune
	
	@Bean
	public Coach ccoach() {
		CricketCoach mycoach= new CricketCoach(happyFortune());
		return mycoach;
	}
	@Bean
	public CricketCoach coach() {
		return new CricketCoach("vaishali");
	}
	
}
