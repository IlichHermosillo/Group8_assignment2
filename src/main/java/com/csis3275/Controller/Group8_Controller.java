package com.csis3275.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.Model.Group8_Model;

@Controller
public class Group8_Controller {

	@GetMapping("/")
	public String displayIdex() {
		return("index.html");
	}
	
	@GetMapping("/group8-ilich")
	public String displayStudents(Model model) {
		Group8_Model st = new Group8_Model(300358049, 3275, 002, "Ilich", "Hermosillo", "CSIS - Data Analyst");
		model.addAttribute("st", st);
		return "ihe-49-View";
	}
}
