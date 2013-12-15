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

	private String codCliente;	//para dar codigo aos clientes
	protected String nome;
	private String endereco;
	private List<Telefone> telefones = new ArrayList<Telefone>();
	protected Integer contClientes = 0;	//para numerar sequencialmente os clientes

	//public abstract boolean adicionaCliente(String nome, String idCliente);

	
	

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		if (codCliente.length()==7)
			this.codCliente = codCliente;
	}

	public Integer getContClientes() {
		return contClientes+1;
	}

	public void setContClientes(Integer contClientes) {
		this.contClientes = contClientes;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome!=null && nome!="")
			this.nome = nome;
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
	
	/*public Telefone adicionaTelefone(Telefone telefone){
		
		return null;
		
	}*/

	public abstract String getCodigoFormatado();

}


