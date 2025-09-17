package com.jenkinsApp.simpleCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home(){
		return "Try url /add?a=2&b=7";
	}
}