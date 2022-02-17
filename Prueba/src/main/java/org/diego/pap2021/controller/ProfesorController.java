package org.diego.pap2021.controller;

import java.util.List;

import org.diego.pap2021.entities.Asignatura;
import org.diego.pap2021.entities.Profesor;
import org.diego.pap2021.exception.DangerException;
import org.diego.pap2021.exception.PRG;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {
	
	@GetMapping("r")
	public String r(
			ModelMap m
			) {
		List<Profesor> asignaturas = profesorService.findAll();
		m.put("asignaturas", asignaturas);
		m.put("view","asignatura/r");
		return "_t/frame";
	}
	
	@GetMapping("c")
	public String c(
			ModelMap m
			) {
		m.put("view","asignatura/c");
		return "_t/frame";
	}
	
	@PostMapping("c")
	public String cPost(
			@RequestParam("nombre") String nombre
			) throws DangerException {
		try {
			asignaturaService.crearAsignatura(nombre);
			
		} 
		catch (Exception e) {
			PRG.error(e.getMessage(),"/asignatura/c");
		}
		return "redirect:/asignatura/r";
	}

}
