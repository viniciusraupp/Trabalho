package entidade;

/**
 * Classe Pessoa Fisica Heranca da Classe Cliente
 * 
 * @author Andre e Vinícius 24/11/2013
 */

public class PessoaFisica extends Cliente {

	private String cpf;
	
	@Override
	public boolean adicionaCliente(String nome, String cpf) {
		if (nome.length() > 1 && cpf.length() == 11) {
			super.nome = nome;
			this.cpf = cpf;
			return true;
		}
		return false;		
	}

	public String getCPF() {
		return cpf;
	}

	// @return the cpf no formato 333.333.333-22
	public String getCPFFormatado() {
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}

}
