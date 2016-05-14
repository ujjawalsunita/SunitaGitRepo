package com.javacodegeeks.snippets.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hellowWorld")
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(ModelMap model){
		model.addAttribute("msg","/JCG Hello World");
		return "hellowWorld";
		
	}
	@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
	public String displayMessage(@PathVariable String msg, ModelMap model) {
		model.addAttribute("msg", msg);
		return "helloWorld";
	}
	




}
