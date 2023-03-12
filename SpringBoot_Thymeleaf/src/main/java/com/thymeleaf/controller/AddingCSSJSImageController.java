package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddingCSSJSImageController {

	@GetMapping("/addingcssjsimage")
	public String addingCssJsImage(Model model) {
		
		return "addingcssjsimage";
	}
}
