package entidade;
/**
 * Classe Pessoa Fisica
 * 		Heranca da Classe Cliente
 * @author Andre e Vinícius
 * 24/11/2013
 */
public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	public PessoaFisica(String nome) {
		super(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
