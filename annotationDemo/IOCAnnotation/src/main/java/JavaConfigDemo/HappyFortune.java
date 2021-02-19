package JavaConfigDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements IFortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "hav a nice day";
	}

}
