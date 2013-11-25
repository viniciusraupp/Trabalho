package entidade;

/*
 *  Classe Pessoa Juridica
 *  	herança da Classe Cliente
 */
public class PessoaJuridica extends Cliente {

	private String cnpj;

	@Override
	public boolean adicionaCliente(String nome, String cnpj) {
		if (nome.length() > 1 && cnpj.length() == 14) {
			super.nome = nome;
			this.cnpj = cnpj;
			return true;
		}
		return false;		
	}

	/**
	 * @return the cnpj
	 */
	public String getCNPJ() {
		return cnpj;
	}

	/**
	 * @return the cnpj no formato 22.333.333.4444-22
	 */
	public String getCNPJFormatado() {
		return (cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "."
				+ cnpj.substring(5, 8) + "." + cnpj.substring(8, 12) + "-" + cnpj
					.substring(12, 14));
	}

}
