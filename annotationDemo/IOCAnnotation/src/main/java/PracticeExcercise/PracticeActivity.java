package PracticeExcercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("practiceActivity")
public class PracticeActivity implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	private IFortune fortuneService;
	
	// define a default constructor
	public PracticeActivity () {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
