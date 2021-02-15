package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ncu.annotationDemo.IOCAnnotation.Coach;
import com.ncu.annotationDemo.IOCAnnotation.IFortune;

@Component("ccoach")
public class CricketCoach implements Coach{
private IFortune ifortune;

@Autowired
public CricketCoach(IFortune ifortune) {
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
}