package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	@RequestMapping("/home")
	public String show() {
		return "index";
	}			
}
	


