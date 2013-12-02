package controle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entidade.Contrato;

public class ControleDoContratoTest {
	private ControleDoContrato controle;
	private Contrato contrato;

	@Before
	public void setUp() throws Exception {
		controle = new ControleDoContrato();
		contrato = new Contrato("234545");

	}

	@Test
	public void testPagar() {
		controle.setValPorExcedente(0.04);
		contrato.adicionaImpressoras("453", "ER", "MA");
		contrato.setFranquiaPaginas(200000);
		contrato.setValorContrato(500.00);
		controle.TotalPagar();
		assertEquals("Total a pagar sem excedente deve ser 50", 500,controle.getTotalPagar(),0);

	}

}
