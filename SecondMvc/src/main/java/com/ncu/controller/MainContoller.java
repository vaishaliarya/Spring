package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContoller {

	@RequestMapping("/home")
	public String Home() {
		return "home-page";
	}
	@RequestMapping("/login")
	public String logIn() {
		return "login";
	}
}


