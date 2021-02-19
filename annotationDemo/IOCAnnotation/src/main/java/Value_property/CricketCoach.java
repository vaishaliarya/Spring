package Value_property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import Value_property.Coach;
import Value_property.IFortune;

@Component("ccoach")//----this is your bean----object created for the bean<bean id="ccocach" class="fullyqualifiedname">
public class CricketCoach implements Coach{

@Value("${name}")
private String name;
@Value("${email}")
private String e_mail;

private IFortune ifortune;//injection


@Autowired
public CricketCoach(@Qualifier("restFortune")IFortune ifortune) {
	this.ifortune=ifortune;
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
public String getE_mail() {
	return e_mail;
}

public String getName() {
	return name;
}
}