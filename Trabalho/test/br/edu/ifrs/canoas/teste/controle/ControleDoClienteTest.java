package br.edu.ifrs.canoas.teste.controle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.controle.ControleDoCliente;
import br.edu.ifrs.canoas.entidade.Cliente;
import br.edu.ifrs.canoas.entidade.PessoaFisica;
import br.edu.ifrs.canoas.entidade.PessoaJuridica;

/**
 * Classe de teste do Controle de Cliente
 * 		Inserindo novo cliente, ele é pessoa física ou juridica
 * @author Andre e Vinicius
 * 15/12/2013
 */
public class ControleDoClienteTest {

	ControleDoCliente controle;
	
	@Before
	public void setUp() throws Exception {
		controle = new ControleDoCliente();
	}

	@Test
	public void testNovoCliente() {
		
		assertNull("Não pode ter cpf e cnpj juntos",controle.novoCliente("Andre", "CLI0001", "Rua A","12345678901", "12345678901234"));
		assertNull("Precisa nome",controle.novoCliente(null, "CLI0001", "Rua A", "12345678901", null));
		assertNull("Precisa codigo do cliente",controle.novoCliente("Andre", null, "Rua A", "12345678901", null));
		assertNull("Precisa endereço",controle.novoCliente("Andre", "CLI0001", null, "12345678901", null));
	}
	
	@Test
	public void testNovoClientePessoaFisica(){
				
		Cliente cliente1 = controle.novoCli("12345678901", null);
		assertFalse("Deve ser pessoa Fisica",cliente1 instanceof PessoaJuridica);
		assertTrue("Deve ser pessoa Fisica",cliente1 instanceof PessoaFisica);
	}
	
	@Test
	public void testNovoClientePessoaJuridica(){	
		
		Cliente cliente2 = controle.novoCli(null,"12345678901234");
		assertFalse("Deve ser Pessoa Juridica",cliente2 instanceof PessoaFisica);
		assertTrue("Deve ser pessoa Juridica",cliente2 instanceof PessoaJuridica);
	}
}	
	



