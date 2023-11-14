package br.com.hospitallotexv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/clinicas")
public class ClinicasController {

	@GetMapping
	public void getAll() {
		//TODO Implementar a consulta de categorias
	}
}
