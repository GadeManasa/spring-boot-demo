package com.jenkinsApp.simpleCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
	
	private AdditionServiceImpl additionServiceImpl;

	AdditionController(AdditionServiceImpl additionServiceImpl){
		this.additionServiceImpl = additionServiceImpl;
	}
	
	@GetMapping("/add")
	Integer add(@RequestParam int a,@RequestParam int b) {	
		return additionServiceImpl.add(a, b);	
	}

}
