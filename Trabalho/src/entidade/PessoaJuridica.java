package entidade;
/*
 *  Classe Pessoa Juridica
 *  	heran�a da Classe Cliente
 */
public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	
	public PessoaJuridica(String nome) {
		super(nome);
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
