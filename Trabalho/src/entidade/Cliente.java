package entidade;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String endereco;
	private List<Telefone> telefones = new ArrayList<Telefone>();

	public Cliente(String nome) {
		// super();
		this.nome = nome;
	}

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

	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}

	public void adicionaTelefone(Telefone telefone) {
		//telefones.add(3435345,celular);
	}

}
