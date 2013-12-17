package br.edu.ifrs.canoas.excecao;

/**
 * @author Andre e Vinicius
 * 16/12/2013
 */
public class CpfExcecao extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CpfExcecao(String msg) {
		super(msg);
	}
}
