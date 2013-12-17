package br.edu.ifrs.canoas.entidade;

/**
 * Classe Pessoa Juridica - heran�a de Cliente
 * 
 * @author Andre e Vinicius
 * 14/12/2013
 */
public class PessoaJuridica extends Cliente {

	private String cnpj;
	//private Integer cnpj;

	public PessoaJuridica(){
	}

	public String getCNPJ() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		if (cnpj!=null && cnpj.length()==14)
			this.cnpj = cnpj;
		else
			this.cnpj=null;
	}
	
	public boolean IncluiPessoaJuridica(String nome, String cnpj){
		if (nome!=null && nome!="" && cnpj.length() == 14) {
			super.nome = nome;
			this.cnpj = cnpj;
			super.contClientes+=1;
			return true;
		}
		return false;		
	}
	

	// @return o cnpj no formato 22.333.333/4444-22
	public String getCNPJFormatado() {
		return (cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "."
				+ cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" + cnpj
					.substring(12, 14));
	}

	@Override
	public String getCodigoFormatado() {
		if(contClientes<10)
			return ("CLI"+"000"+Integer.toString(contClientes));
		if(contClientes<100)
			return ("CLI"+"00"+Integer.toString(contClientes));
		if(contClientes<1000)
			return ("CLI"+"0"+Integer.toString(contClientes));
	return ("CLI"+Integer.toString(contClientes));
	}

}
