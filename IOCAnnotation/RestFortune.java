package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RestFortune implements IFortune{
public String getFortune() {
	return "you have a good fortune today";
}
}
