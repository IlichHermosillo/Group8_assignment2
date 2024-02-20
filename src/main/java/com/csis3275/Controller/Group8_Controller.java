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
	
	@GetMapping("/students/ihe-49-View")
	public String displayStudents(Model model) {
		Group8_Model st = new Group8_Model("Ilich", "Hermosillo", 300358049, 3275, 002, "CSIS - Data Analyst");
		model.addAttribute("st", st);
		return "/students/ihe-49-View";
	}
	
	@GetMapping("/student/habib")
	public String getHabibInformation(Model model) {
		Group8_Model habib = new Group8_Model("Habib", "Javed", 300281273, 3275, 002, "CSIS - Dipolma");
		model.addAttribute("habib", habib);
		return "/students/hja_73_view";
	}
}
