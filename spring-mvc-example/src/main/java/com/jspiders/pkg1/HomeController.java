package com.jspiders.pkg1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.model.User;



@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView launch() {
		ModelAndView model= new ModelAndView();
		System.out.println("User Page Requested");
		model.addObject("userName","hello");
		model.setViewName("home");
		return model;
	}
	
}
