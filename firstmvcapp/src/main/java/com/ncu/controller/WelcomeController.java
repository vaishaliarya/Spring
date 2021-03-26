package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "vaishali");
		return "welcome";
	}
//	@RequestMapping("/login")
//	public String loginmsg(Model model) {
//		model.addAttribute("msg", "kalra login");
//		return "login";
//	}
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, Model model) {
		String userId=request.getParameter("userId");
		model.addAttribute("msg", "kalra login"+userId);
		return "login";
	}
}
