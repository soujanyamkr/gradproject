package edu.missouristate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		

		return "home";
	}

}
