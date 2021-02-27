package com.lsefiane.security.employee.application.sample.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {
	
    @GetMapping(value={"/", "/index"})
    public String getHomePage(Model model){

        return "index";
    }

}
