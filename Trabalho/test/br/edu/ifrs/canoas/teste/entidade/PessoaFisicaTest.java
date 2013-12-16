package br.edu.ifrs.canoas.teste.entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.entidade.PessoaFisica;

/**
 * Classe de teste Pessoa Fisica
 * 
 * @author Andre e Vinicius
 * 20/11/2013
 */
public class PessoaFisicaTest {

	private PessoaFisica cliente1;
	
	@Before
	public void setUp() throws Exception {
		cliente1 = new PessoaFisica();
	}

	@Test
	public void setCpfTest(){
		
		cliente1.setCpf(null);
		assertNull("CPF deve ser nulo",cliente1.getCPF());
		
		cliente1.setCpf("321");
		assertNull("CPF deve ter 11 digitos",cliente1.getCPF());
		
		cliente1.setCpf("12345678901");
		assertEquals("CPF é 12345678901","12345678901",cliente1.getCPF());
		
		cliente1.setCpf("1234567890123456789");
		//assertEquals("CPF é 12345678901","12345678901",cliente1.getCPF());
		assertNull("CPF deve ter só 11 digitos",cliente1.getCPF());
	}

	@Test
	public void getCPFFormatadoTest() {
		cliente1.setCpf("12345678901");
		assertEquals("cpf correto", "123.456.789-01",
				cliente1.getCPFFormatado());
		assertNotEquals("cpf correto", "023.456.789-01",
				cliente1.getCPFFormatado());
	}
	
	@Test
	public void testGetCodigoFormatado() {
		fail("Not yet implemented");
	}

}