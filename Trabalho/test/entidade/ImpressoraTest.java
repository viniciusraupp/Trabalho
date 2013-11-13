package entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ImpressoraTest {

	Impressora impressora1;

	@Before
	public void setUp() throws Exception {
		impressora1 = new Impressora();
	}

	@Test
	public void testGetNumserie() {
		impressora1.setNumserie("F01XB");
		assertEquals("Número de série deve ser F01XB", "F01XB", impressora1.getNumserie());
	}

	@Test
	public void testGetMarca() {
		impressora1.setMarca("EPSON");
		assertEquals("Marca deve ser F01XB", "EPSON", impressora1.getMarca());
	}

	@Test
	public void testGetModelo() {
		impressora1.setModelo("EXP1");
		assertEquals("Modelo deve ser F01XB", "EXP1", impressora1.getModelo());
	}

	@Test
	public void testGetContadorPaginas() {
		assertEquals("Contador inicial deve ser zero", 0, impressora1.getContadorPaginas());
	}

}
