package br.edu.ifrs.canoas.controle;

import br.edu.ifrs.canoas.entidade.Cliente;
import br.edu.ifrs.canoas.entidade.PessoaFisica;
import br.edu.ifrs.canoas.entidade.PessoaJuridica;

/**
 * Classe para controle do cliente
 * 	identifica se é pessoa fisica ou juridica
 * 
 * @author Andre e Vinicius
 * 15/12/2013
 * @param <telefone>
 */
public class ControleDoCliente {
	
	private Cliente cliente;

	public Cliente novoCli(String cpf,String cnpj){
		
		if(cpf!=null && cnpj==null){
			cliente = new PessoaFisica();
			((PessoaFisica)cliente).setCpf(cpf);
			return cliente;
		}	
		else if(cpf==null && cnpj != null){
			cliente = new PessoaJuridica();
			((PessoaJuridica)cliente).setCnpj(cnpj);
			return cliente;
		}
		return null;
	}
	
	public Cliente novoCliente(String nome,String codCliente,
	String endereco, String cpf,String cnpj){

		if(cpf!=null && cnpj==null){
			cliente = new PessoaFisica();
			((PessoaFisica)cliente).setCpf(cpf);
		}	
		else if(cpf==null && cnpj != null){
			cliente = new PessoaJuridica();
			((PessoaJuridica)cliente).setCnpj(cnpj);
		}
		else
			return null;

		if (nome!=null && nome.isEmpty() &&
				codCliente!=null && codCliente.isEmpty() &&
				endereco!=null && endereco.isEmpty()){
			cliente.setNome(nome);
			cliente.setCodCliente(codCliente);
			cliente.setEndereco(endereco);

			return cliente;
		}
		else		
			return null;
	}
}
