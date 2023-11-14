package br.com.hospitallotexv.domain.entities;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class Clinica {

	private UUID idClinica;
	private String nome;
	private String cpf;
	private String diagnostico;
	private List<Atendimento> atendimento;

}
