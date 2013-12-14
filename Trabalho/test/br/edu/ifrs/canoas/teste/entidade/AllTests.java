package br.edu.ifrs.canoas.teste.entidade;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Andre e Vinicius
 * 30/11/2013
 */
@RunWith(Suite.class)
@SuiteClasses({ ImpressoraTest.class, PessoaFisicaTest.class,
		PessoaJuridicaTest.class, ContratoTest.class })
public class AllTests {

}
