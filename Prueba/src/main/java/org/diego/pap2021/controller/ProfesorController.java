package org.diego.pap2021.controller;

import java.util.List;

import org.diego.pap2021.entities.Asignatura;
import org.diego.pap2021.entities.Profesor;
import org.diego.pap2021.exception.DangerException;
import org.diego.pap2021.exception.PRG;
import org.diego.pap2021.service.AsignaturaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {
	
	
 private AsignaturaService asignaturaService;

	@GetMapping("c")
	public String c(
			//para pasar datos
			ModelMap m
			) {
		m.put("asignaturas",asignaturaService.findAll());
		m.put("view","profesor/c"); 
		return "_t/frame";
	}
	
	@PostMapping("c")
	public String cPost(
			//los datos que se le pasan desde c
			
			@RequestParam("dni")String dni,
			@RequestParam("password")String password,
			@RequestParam("nombre")String nombre,
			@RequestParam("apellido")String apellido,
			@RequestParam("idAsignatura[]",required=false)List<Long>idAsignatura,

			) {
		profesorService
		return "redirect:/profesor/r";
	}
	
	@GetMapping("r")
	public String r(
			ModelMap m
			) {
		m.put("view","profesor/r");
		return "_t/frame";
	}
}
