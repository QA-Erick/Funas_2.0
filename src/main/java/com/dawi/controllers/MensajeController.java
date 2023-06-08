package com.dawi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dawi.models.Mensaje;
import com.dawi.services.MensajeService;

@Controller
public class MensajeController {

	@Autowired
	private MensajeService service;
	
	@GetMapping("/")
	public String Principal() {
		return "principal";
	}
	
	@GetMapping("/nuevaFuna")
	public String nuevaFuna(@ModelAttribute("mensaje") Mensaje msj) {
		return "nuevaFuna";
	}
	
	@PostMapping("/nuevaFuna")
	public String registrarMensaje(@ModelAttribute("mensaje") Mensaje msj) {
		service.publicarMensaje(msj);
		return "redirect:/";
	}
}
