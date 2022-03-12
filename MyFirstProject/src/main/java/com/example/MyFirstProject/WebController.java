package com.example.MyFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myLibrary")
public class WebController {
	
	@Autowired
	BookService bookservice;
	
	@RequestMapping("/web") 
	public String getWeb(Model containerToView) {
		
		containerToView.addAttribute("booksfromController", 
				bookservice.queryBook());
		
		System.out.println("provem si funciona");
		
		return "web";
	}
	
	

}
