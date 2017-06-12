package com.metatarsal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="grocery")
public class GroceryListController {
	
	@RequestMapping(value="")
	public String index(Model model) {
		
		String test = new String();
		test = "This is a test.";
		model.addAttribute("title","Index");
		model.addAttribute("test",test);
		return "grocery/index";
		
	}

}
