package br.edu.ifrs.canoas.teste.entidade;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import br.edu.ifrs.canoas.entidade.Contrato;

/**
 * Classe de Teste do Contrato
 * 
 * @author Andre e Vinicius
 * 01/12/2013
 */
public class ContratoTest {

	private Contrato contrato; 

	@Test
	public void testContrato() {
		contrato = new Contrato("021587");
		assertEquals("Numero do contrato tem que ser 021587","021587" , contrato.getNumcontrato());
		contrato = new Contrato("");
		assertEquals("Numero do contrato tem que ser nulo",null , contrato.getNumcontrato());
	}
	
	@Ignore //@Test
	public void testSetDataInicio() {
		contrato = new Contrato("021587");
		
	}

	@Ignore //@Test
	public void testSetValorcontrato() {
		fail("Not yet implemented");
	}

	@Ignore //@Test
	public void testSetFranquiaPaginas() {
		fail("Not yet implemented");
	}

	@Ignore //@Test
	public void testAdicionaCliente() {
		fail("Not yet implemented");
	}

}
