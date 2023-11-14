package br.com.hospitallotexv.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/atendimentos")
public class AtendimentosController {

	@PostMapping
	public void post() {
		//TODO implementar o cadastro de atendimento
	}
	@PutMapping
	public void put() {
		//TODO implementar a edição do atendimento
	}
	@DeleteMapping
	public void delete() {
		//TODO implementar a exclusão do atendimento
	}
	@GetMapping
	public void getAll() {
		//TODO implementar a consula de atendimento
	}
}
