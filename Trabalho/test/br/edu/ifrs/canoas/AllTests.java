package br.edu.ifrs.canoas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Suite de testes
 * 
 * @author Andre e Vinicius
 * 
 * 14/12/2013
 */

@RunWith(Suite.class)
@SuiteClasses({br.edu.ifrs.canoas.teste.controle.AllTests.class,br.edu.ifrs.canoas.teste.entidade.AllTests.class})
public class AllTests {

}
