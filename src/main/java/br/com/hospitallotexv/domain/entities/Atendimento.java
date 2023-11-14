package br.com.hospitallotexv.domain.entities;

import java.util.UUID;

import lombok.Data;

@Data
public class Atendimento {
	private UUID idAtendimento;
	private String nome;
	private String cpf;
	private String endereco;
	private Clinica clinica;
	private Enfermaria enfermaria;
}
