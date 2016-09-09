package com.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerForCart {
	
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("index called");
		return "index";
	}
	@RequestMapping("/login")

	public String login()
	{
		System.out.println("login called");
		return "login";
	}
	@RequestMapping("/register")

	public String register()
	{
		System.out.println("register called");
		return "register";
	}

}
