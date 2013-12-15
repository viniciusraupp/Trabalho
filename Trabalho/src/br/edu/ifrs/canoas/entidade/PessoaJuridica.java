package br.edu.ifrs.canoas.entidade;

/**
 * Classe Pessoa Juridica - herança de Cliente
 * 
 * @author Andre e Vinicius
 * 14/12/2013
 */
public class PessoaJuridica extends Cliente {

	private String cnpj;

	//@Override
	//public boolean adicionaCliente(String nome, String cnpj) {
	public PessoaJuridica(String nome,String cnpj){
		if (nome!=null && nome!="" && cnpj.length() == 14) {
			super.nome = nome;
			this.cnpj = cnpj;
			//return true;
		}
		//return false;		
	}

	public String getCNPJ() {
		return cnpj;
	}

	// @return o cnpj no formato 22.333.333/4444-22
	public String getCNPJFormatado() {
		return (cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "."
				+ cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" + cnpj
					.substring(12, 14));
	}

	@Override
	public String getCodigoFormatado() {
		//if(adicionaCliente(nome,cpf))  
		if(contClientes<10)
			return ("CLI"+"000"+Integer.toString(contClientes));
		if(contClientes<100)
			return ("CLI"+"00"+Integer.toString(contClientes));
		if(contClientes<1000)
			return ("CLI"+"0"+Integer.toString(contClientes));
	return ("CLI"+Integer.toString(contClientes));
	}

}
