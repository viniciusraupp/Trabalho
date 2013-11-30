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

	
	private ControleDoContrato contrato;
	//Contrato contrato1;
		
	@Before
	public void setUp() throws Exception {
		
		contrato = new ControleDoContrato();
				
	}

	// Teste Adiciona Contrato
		@Test
	public void testAdicionaContrato() {
		contrato.adicionaContrato("0001", "ABC", "00023512000135", "0123ABC", "LIVRE", "LI02");
		
		//assertEquals("Numero do cOntrato deve ser 0001", "0001", contrato.adicionaContrato("0001", "ABC", "00023512000135", "0123ABC", "LIVRE", "LI02");
		//assertEquals("Numero do cOntrato deve ser 0001", 0, contrato.equals(contrato));
	}
	
	// Teste Inclui Impressora
	@Test
	public void testIncluiImpressora() {
		contrato.incluiImpressora("987654", "HP", "L09H");
		//contrato1=new Contrato();
		//assertEquals("Numero do impressoras deve ser 1", 1, contrato.getNumTotalImpressoras();
		//assertEquals("Numero do cOntrato deve ser 0001", 0, contrato.equals(contrato));
	}
	
	//Teste franquia de p�ginas
	
	/*@Test
	public void testGetFranquiaPaginas() {
		contrato.setFranquiaPaginas(1000);
		assertEquals("Franquia de p�ginas deve ser 1000", 1000, contrato.getFranquiaPaginas());
	}*/

	// Teste
	@Test
	public void testSetFranquiaPaginas() {
		fail("Not yet implemented");
	}

	// Teste
	@Test
	public void testImprimir() {
		fail("Not yet implemented");
	}

	// Teste
	@Test
	public void testTrocarToner() {
		fail("Not yet implemented");
	}

	// Teste
	@Test
	public void testTrocarFusor() {
		fail("Not yet implemented");
	}

}
