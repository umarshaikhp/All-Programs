package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerTest {
	
	@RequestMapping("/hello")
	public String show(@RequestParam("name")String name,@RequestParam("pass")String pass,Model model) {
		if (name.equals("admin")) {
			String msg = "Hello" + name;
			System.out.println(msg);
			model.addAttribute("message",msg);
			return "viewPage";	
		}	
		else {
			String msg = "Sorry " + name + " you entered incorrect password";
			model.addAttribute("messge", msg);
			return "errorPage";
		}
	}
}