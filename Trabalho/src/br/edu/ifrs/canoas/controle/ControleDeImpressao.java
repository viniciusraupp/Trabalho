/**
 * 
 */
package br.edu.ifrs.canoas.controle;

import br.edu.ifrs.canoas.entidade.Impressora;

/**
 * @author Andre e Vinicius 20/11/2013
 */
public class ControleDeImpressao {

	private Impressora impressora;

	public Boolean isTrocaImpressora() {
		if (impressora.getVidaUtil() >= 100000) {
			return true;
		} else {
			return false;
		}

	}

}
