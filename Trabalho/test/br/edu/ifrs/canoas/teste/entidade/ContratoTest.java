/**
 * 
 */
package br.edu.ifrs.canoas.teste.entidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ifrs.canoas.entidade.Contrato;

/**
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
	
	@Test
	public void testSetDataInicio() {
		contrato = new Contrato("021587");
		
	}

	@Test
	public void testSetValorcontrato() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFranquiaPaginas() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdicionaCliente() {
		fail("Not yet implemented");
	}

}
