package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/home")
	//@ResponseBody
	public String handletest() {
		return "home";
	//	return "this is the page first by Boot";
	}
	
}
