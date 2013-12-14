package br.edu.ifrs.canoas.entidade;

/**
 * Interface Negociavel
 * 
 * @author Andre e Vinícius 24/11/2013
 */
public interface Negociavel {

	public void adicionaCliente(String nome, String cnpj);
	public void adicionaImpressoras(String numSerie, String marca,String modelo);
	public void setFranquiaPaginas(Integer franquiaPaginas);	

}
