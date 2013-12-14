package br.edu.ifrs.canoas.teste.controle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.controle.ControleDoContrato;
import br.edu.ifrs.canoas.entidade.Contrato;

/**
 * Classe de teste do Controle de Contrato
 * @author Andre e Vinicius
 * 14/12/2013
 */
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
