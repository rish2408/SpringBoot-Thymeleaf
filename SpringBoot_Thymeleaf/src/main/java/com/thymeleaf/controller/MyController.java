package com.thymeleaf.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("name", "Rishabh Srivastava");
		model.addAttribute("currentDate", new Date().toLocaleString());

		return "about";
	}

	@GetMapping("/iterate")
	public String iterate(Model model) {

		List<String> list = List.of("Rishabh", "Mansi", "Avimanyu", "Shubhangi");

		model.addAttribute("listOfElements", list);

		return "iterate";
	}
	
	@GetMapping("/conditionalHandler")
	public String conditionalHandler(Model model) {

		model.addAttribute("isActive",true);
		model.addAttribute("gender","F");
		
		List<Integer> listOfNumbers = List.of(12,13,54,26,45);
		
		model.addAttribute("lon",listOfNumbers);
		
		return "conditionalHandler";
	}
	
	@GetMapping("/fragments")
	public String service(Model model) {
		
		model.addAttribute("title", "Rishabh Srivastava");
		model.addAttribute("currDateTime",new Date().toLocaleString());
		
		return "service";
	}
	
	@GetMapping("/contact-us")
	public String contactUs(Model model) {
		
		return "contactUs";
	}

}
