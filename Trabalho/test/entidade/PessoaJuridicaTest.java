package entidade;

import static org.junit.Assert.*;
/*
* Testando o download.
*/
import org.junit.Before;
import org.junit.Test;

public class PessoaJuridicaTest {
	
	PessoaJuridica cliente1;

	@Before
	public void setUp() throws Exception {
		cliente1 = new PessoaJuridica("Fulano");
	}

	@Test
	public void AdicionaPessoaJuridicatest() {
		cliente1.setEndereco("Rua Cinco");
		//cliente1.adicionaTelefone(232545);
	}

}
