package br.edu.ifrs.canoas.entidade;

/**
 * Classe abstrata Cliente
 * @author Andre
 * @author Vinícius
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

	protected String nome;
	private String endereco;
	private List<Telefone> telefones = new ArrayList<Telefone>();

	/**
	 * @param nome
	 * @param cpf
	 *            ou cnpj
	 */
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
