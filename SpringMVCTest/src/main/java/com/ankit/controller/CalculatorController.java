package com.ankit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

	@RequestMapping("/index.ankit")
	public String indexPage() {
		return "cal";
	}
	
	@RequestMapping("/calculate.ankit")
	public ModelAndView calculateResult(
						@RequestParam("num1") Integer num1,
						@RequestParam("num2") Integer num2) {
		
		int result = num1 + num2;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("result", result);
		modelAndView.setViewName("result");
		return modelAndView;
	}
}
