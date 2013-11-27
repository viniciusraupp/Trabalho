/**
 * 
 */
package controle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entidade.Contrato;

/**
 * Classe de Teste do Controle do Contrato
 * 
 * @author Andre
 * @author Vinicius
 *
 * 26/11/2013
 *
 */
public class ControleDoContratoTest {

	
	ControleDoContrato contrato;
		
	@Before
	public void setUp() throws Exception {
		
		contrato = new ControleDoContrato();
				
	}

	/**
	 * Teste Adiciona Contrato
	 */
	@Test
	public void testAdicionaContrato() {
		contrato.adicionaContrato("0001", "ABC", "00023512000135", "0123ABC", "LIVRE", "LI02");
		
		//assertEquals("Numero do cOntrato deve ser 0001", "0001", contrato.adicionaContrato("0001", "ABC", "00023512000135", "0123ABC", "LIVRE", "LI02");
		//assertEquals("Numero do cOntrato deve ser 0001", 0, contrato.equals(contrato));
	}
	
	/**
	 * Test franquia de páginas
	 */
	/*@Test
	public void testGetFranquiaPaginas() {
		contrato.setFranquiaPaginas(1000);
		assertEquals("Franquia de páginas deve ser 1000", 1000, contrato.getFranquiaPaginas());
	}*/

	/**
	 * Test method for {@link controle.ControleDoContrato#setFranquiaPaginas(int)}.
	 */
	@Test
	public void testSetFranquiaPaginas() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link controle.ControleDoContrato#imprimir(entidade.Impressora, int)}.
	 */
	@Test
	public void testImprimir() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link controle.ControleDoContrato#trocarToner(entidade.Impressora)}.
	 */
	@Test
	public void testTrocarToner() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link controle.ControleDoContrato#trocarFusor(entidade.Impressora)}.
	 */
	@Test
	public void testTrocarFusor() {
		fail("Not yet implemented");
	}

}
