package com.ciu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// sample url 
//http://localhost:8080/springmvctest/username/winzip/userid/123
public class SpringUrltemplate {
	@RequestMapping("/username/{username}/userid/{userid}")
	public ModelAndView test1(@PathVariable String username,
			@PathVariable int userid){
		ModelAndView mv = new ModelAndView();
		mv.addObject("username", username);
		mv.addObject("userid", userid);
		mv.setViewName("urltemplate");
		return mv;		
	}

}
