package ValueAnnot;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import ValueAnnot.Coach;


@Component("ccoach")//----this is your bean----object created for the bean<bean id="ccocach" class="fullyqualifiedname">
public class CricketCoach implements Coach{

	@Value(value="vaishali")
	private String name;//injection

@Override
public String getDailyWorkout() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return null;
}

public String getName() {
	return name;
}


//constructor Injection<bean id="ccocach" class="  " autowire="constructor">



}
