package com.jetro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= {"/"})
public class LoginController {
	
	@RequestMapping()
    public ModelAndView handleRequest() throws Exception {
        ModelAndView model = new ModelAndView("redirect:/relatorios/lista");
        return model;
    }
	
	@RequestMapping(value="/login")
	public ModelAndView loginPage () {
		ModelAndView model = new ModelAndView("Login");
		return model;
	}
}
