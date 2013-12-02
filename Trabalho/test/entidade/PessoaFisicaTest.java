package entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
	public void adicionaPessoaFisicaTest() {

		assertTrue("Nome de cliente valido e cpf valido com 11 digitos",
				cliente1.adicionaCliente("Fulano", "12345678901"));
		assertFalse(
				"Nome de cliente valido e cpf invalido, com menos de 11 digitos",
				cliente1.adicionaCliente("Fulano", "2345678901"));
		assertFalse(
				"Nome de cliente valido e cpf invalido, com mais de 11 digitos",
				cliente1.adicionaCliente("Fulano", "112345678901"));
		assertFalse("Nome de cliente vazio e cpf valido",
				cliente1.adicionaCliente("", "12345678901"));
		assertFalse("Nome de cliente valido e cpf vazio",
				cliente1.adicionaCliente("Fulano", ""));
	}

	@Test
	public void getCPFTest() {
		cliente1.adicionaCliente("Fulano", "12345678901");
		assertEquals("cpf correto", "12345678901", cliente1.getCPF());
		assertNotEquals("cpf correto", "45545678901", cliente1.getCPF());
	}

	@Test
	public void getCPFFormatadoTest() {
		cliente1.adicionaCliente("Fulano", "12345678901");
		assertEquals("cpf correto", "123.456.789-01",
				cliente1.getCPFFormatado());
		assertNotEquals("cpf correto", "023.456.789-01",
				cliente1.getCPFFormatado());
	}

}