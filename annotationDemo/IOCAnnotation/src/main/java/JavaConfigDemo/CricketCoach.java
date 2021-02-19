package JavaConfigDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import JavaConfigDemo.Coach;
import JavaConfigDemo.IFortune;

@Component("ccoach")
@Scope("prototype")
//----this is your bean----object created for the bean<bean id="ccocach" class="fullyqualifiedname">
public class CricketCoach implements Coach{
private String name;
	
	private IFortune ifortune;//injection

//constructor Injection<bean id="ccocach" class="  " autowire="constructor">
@Autowired
public CricketCoach(@Qualifier("happyFortune")IFortune ifortune) {
	this.ifortune=ifortune;
}

public CricketCoach(String name) {
	this.name=name;
}
public String getDailyWorkout() {
	return "do strecthing today";
}
//public String getDailyFortune() {
//	return ifortune.getFortune();
//}


@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return ifortune.getFortune();
}



public String getName() {
	// TODO Auto-generated method stub
	return name;
}
}