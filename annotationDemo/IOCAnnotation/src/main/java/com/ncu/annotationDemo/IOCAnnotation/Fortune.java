package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune{
public String getFortune() {
	return "you have a good fortune today";
}
}
