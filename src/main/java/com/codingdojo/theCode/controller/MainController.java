package com.codingdojo.theCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@RequestMapping("/")
	public String login() {
		return "index.jsp";
	}
	
	@PostMapping ("processingForm") 
		public String process(@RequestParam("code") String code) {
		
		if(code.equals("bushido")) {
			return "redirect:/success";
		} 
		return "redirect:/createError";
	}
	
	@RequestMapping("/success")
	public String success() {
		return "code.jsp";
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
}

