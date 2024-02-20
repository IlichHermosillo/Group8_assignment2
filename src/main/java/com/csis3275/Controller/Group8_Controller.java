package com.csis3275.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Group8_Controller {

	@GetMapping("/")
	public String displayMain() {
		return("index.html");
	}
	
	
}
