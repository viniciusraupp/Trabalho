package entidade;
/*
 *  Teste
 */
public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	
	public PessoaJuridica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
