package com.example.demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
	@RequestMapping("/process")
	public String process() {
		return "done";
	}
	
	@RequestMapping("/jjsp")
	public String jj() {
		return "jj.jsp";
	}

}
