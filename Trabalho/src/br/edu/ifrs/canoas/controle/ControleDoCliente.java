package br.edu.ifrs.canoas.controle;

import java.util.ArrayList;

import br.edu.ifrs.canoas.entidade.Cliente;
import br.edu.ifrs.canoas.entidade.PessoaFisica;
import br.edu.ifrs.canoas.entidade.PessoaJuridica;
import br.edu.ifrs.canoas.entidade.Telefone;

/**
 * Classe para controle do cliente
 * 	identifica se é pessoa fisica ou juridica
 * 
 * @author Andre e Vinicius
 * 15/12/2013
 * @param <telefone>
 */
public class ControleDoCliente {

	public Cliente novoCliente(String nome,String codCliente,
			String endereco, ArrayList<Telefone>telefones,
			String cpf,String cnpj){
		
		Cliente cliente;
		
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
