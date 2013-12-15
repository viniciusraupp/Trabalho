package br.edu.ifrs.canoas.entidade;

/**
 * Classe Pessoa Fisica - Heranca da Classe Cliente
 * 
 * @author Andre e Vinícius  
 * 24/11/2013
 */

public class PessoaFisica extends Cliente {

	private String cpf;
	//private Integer cpf;
	
	//@Override
	//public boolean adicionaCliente(String nome, String cpf) {
	//public PessoaFisica(String nome, String cpf){
	public PessoaFisica(){
		/*if (nome!=null && nome!="" && cpf.length() == 11) {
			super.nome = nome;
			this.cpf = cpf;*/
			//return true;
		//}
		//return false;		
	}

	public String getCPF() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf!=null && cpf.length()==11)
			this.cpf = cpf;
	}

	// @return the cpf no formato 333.333.333-22
	public String getCPFFormatado() {
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
	
	// com toString -> return (cpf.toString().substring(0, 3) + "." + cpf.substring(3, 6) + "."
	//		+ cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	
	@Override
	public String getCodigoFormatado(){
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
