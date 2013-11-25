package entidade;

/**
 * Classe de teste Pessoa juridica
 * 
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PessoaJuridicaTest {

	PessoaJuridica cliente1;

	@Before
	public void setUp() throws Exception {
		cliente1 = new PessoaJuridica();
	}

	@Test
	public void adicionaPessoaJuridicaTest() {

		assertTrue("Nome de cliente valido e cnpj valido com 14 digitos",
				cliente1.adicionaPF("Fulano", "12345678912345"));
		assertFalse(
				"Nome de cliente valido e cnpj invalido, com menos de 14 digitos",
				cliente1.adicionaPF("Fulano", "123456789123"));
		assertFalse(
				"Nome de cliente valido e cnpj invalido, com mais de 14 digitos",
				cliente1.adicionaPF("Fulano", "1234567891234545"));
		assertFalse("Nome de cliente vazio e cnpj valido",
				cliente1.adicionaPF("", "12345678912345"));
		assertFalse("Nome de cliente valido e cnpj vazio",
				cliente1.adicionaPF("Fulano", ""));
	}

	@Test
	public void getCNPJTest() {
		cliente1.adicionaPF("Fulano", "12345678912345");
		assertEquals("CNPJ correto", "12345678912345", cliente1.getCNPJ());
		assertNotEquals("CNPJ correto", "00045678912345", cliente1.getCNPJ());

	}

	@Test
	public void getCNPJFormatadoTest() {
		cliente1.adicionaPF("Fulano", "12345678912345");
		assertEquals("CNPJ correto", "12.345.678.9123-45",
				cliente1.getCNPJFormatado());
		assertNotEquals("CNPJ correto", "123.456.789.123-45",
				cliente1.getCNPJFormatado());

	}

}
