package br.edu.ifrs.canoas.controle;

import java.util.ArrayList;

import br.edu.ifrs.canoas.entidade.Cliente;
import br.edu.ifrs.canoas.entidade.PessoaFisica;
import br.edu.ifrs.canoas.entidade.PessoaJuridica;

/**
 * Classe para controle do cliente
 * 	identifica se � pessoa fisica ou juridica
 * 
 * @author Andre e Vinicius
 * 15/12/2013
 * @param <telefone>
 */
public class ControleDoCliente<telefone> {

	public Cliente novoCliente(String nome,String codCliente,String endereco,
			ArrayList<telefone>telefones,String cpf,String cnpj){
		Cliente cliente;
		
		if(cpf!=null && cnpj==null){
			cliente = new PessoaFisica(nome, cpf);
			
		}	
		else if(cpf==null && cnpj != null){
			cliente = new PessoaJuridica(nome, cnpj);
			
		}
		return null;
		
	}
	
	
	
	
/*public ControleUsuario(){}
	
	public Usuario novoUsuario(String nome, String cpf, String dataNascimento, String telefone,String curso, String cargo){
		Usuario user;
		
		if(cargo!=null && curso == null){
			user = new Funcionario();
			((Funcionario) user).setCargo(cargo);
		}else if(cargo == null && curso != null){
			user = new Aluno();
			((Aluno) user).setCurso(curso);
		}else{
			
			return null;
		}
		
		if(nome != null && !nome.isEmpty() 	&& 
				cpf!=null && !cpf.isEmpty() && 
				telefone!=null && !telefone.isEmpty() &&
				dataNascimento != null && !dataNascimento.isEmpty()){
			
			user.setCpf(cpf);
			user.setNome(nome);
			user.setTelefone(telefone);
			user.setDataNascimento(dataNascimento);
			
			return user;
				
		}else{
			return null;
		}
		
	}*/
	
}
