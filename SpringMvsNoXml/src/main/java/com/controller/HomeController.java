package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi()
	{
		return "hi";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/data")
	public String data(Model model)
	{
		model.addAttribute("name", "vamsi");
		return "home";
	}
	
	@RequestMapping("/form")
	public String form(Model model,HttpServletRequest request)
	{
		String uname =(String) request.getParameter("uname");
		System.out.println(uname);
		model.addAttribute("uname", uname);
		return "form";
	}
	
	
}
