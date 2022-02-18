package org.diego.pap2021.controller;

import java.util.List;

import org.diego.pap2021.entities.Asignatura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@GetMapping("r")
	public String r(
			ModelMap m
			) {
		m.put("view","asignatura/r");
		return "_t/frame";
	}
	
	@GetMapping("c")
	public String c(
			ModelMap m
			) {
		m.put("view","alumno/c");
		return "_t/frame";
	}
	
}
