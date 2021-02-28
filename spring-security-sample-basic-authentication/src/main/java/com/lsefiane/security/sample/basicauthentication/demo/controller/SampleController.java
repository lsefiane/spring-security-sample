package com.lsefiane.security.sample.basicauthentication.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * SampleController.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 28, 2021
 *
 */
@Controller
@RequestMapping("/")
public class SampleController {

	@GetMapping(value = { "/", "/index" })
	public String getHomePage(Model model) {
		return "index";
	}

	@GetMapping("/greeting")
	public String greeting(Authentication authentication, Model model) {
		model.addAttribute("name", authentication.getName());
		return "greeting";
	}

}
