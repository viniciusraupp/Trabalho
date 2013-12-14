package br.edu.ifrs.canoas.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata Cliente
 * 
 * @author Andre e Vinicius
 * 14/12/2013
 */

public abstract class Cliente {

	protected String nome;
	private String endereco;
	private List<Telefone> telefones = new ArrayList<Telefone>();

	public abstract boolean adicionaCliente(String nome, String idCliente);

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefones;
	}
}
