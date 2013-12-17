package br.edu.ifrs.canoas.teste.entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.entidade.PessoaJuridica;

/**
 * Classe de teste Pessoa Juridica
 * 
 * @author Andre e Vinicius
 * 30/11/2013
 */

public class PessoaJuridicaTest {

	private PessoaJuridica cliente1;
	
	@Before
	public void setUp() throws Exception {
		cliente1 = new PessoaJuridica();
	}

	@Test
	public void setCpfTest(){
		
		cliente1.setCnpj(null);
		assertNull("CPF deve ser nulo",cliente1.getCNPJ());
		
		cliente1.setCnpj("321");
		assertNull("CPF deve ter 14 digitos",cliente1.getCNPJ());
		
		cliente1.setCnpj("12345678901234");
		assertEquals("CPF é 12345678901234","12345678901234",cliente1.getCNPJ());
		
		cliente1.setCnpj("1234567890123456789");
		//assertEquals("CPF é 12345678901","12345678901",cliente1.getCPF());
		assertNull("CPF deve ter só 14 digitos",cliente1.getCNPJ());
	}

	@Test
	public void getCPFFormatadoTest() {
		cliente1.setCnpj("12345678901234");
		assertEquals("cnpj correto", "12.345.678/9012-34",
				cliente1.getCNPJFormatado());
		assertNotEquals("cnpj correto", "01.023.456/6789-01",
				cliente1.getCNPJFormatado());
	}
	
	@Test
	public void testGetCodigoFormatado() {
		
		cliente1.IncluiPessoaJuridica("LM Info", "12345678901234");
		assertEquals("Código deve ser CLI0001","CLI0001",cliente1.getCodigoFormatado());
		
		cliente1.IncluiPessoaJuridica("LM Info", "12345678901234");
		assertEquals("Código deve ser CLI0002","CLI0002",cliente1.getCodigoFormatado());
		
		for (int i=0;i<8;i++)
			cliente1.IncluiPessoaJuridica("LM Info", "12345678901234");
		assertEquals("Código deve ser CLI0010","CLI0010",cliente1.getCodigoFormatado());
		
		for (int i=0;i<90;i++)
			cliente1.IncluiPessoaJuridica("LM Info", "12345678901234");
		assertEquals("Código deve ser CLI0100","CLI0100",cliente1.getCodigoFormatado());
		
		for (int i=0;i<900;i++)
			cliente1.IncluiPessoaJuridica("LM Info", "12345678901234");
		assertEquals("Código deve ser CLI1000","CLI1000",cliente1.getCodigoFormatado());
		
		cliente1.IncluiPessoaJuridica("LM Info", "12345678901234");
		assertEquals("Código deve ser CLI1001","CLI1001",cliente1.getCodigoFormatado());
	}
}
