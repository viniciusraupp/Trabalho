package entidade;

import java.util.List;

/**
 * Interface Negociavel
 * 
 * @author Andre e Vinícius 24/11/2013
 */
public interface Negociavel {

	public void adicionaCliente(String nome, String cnpj);
	public void adicionaImpressoras(String numSerie, String marca,String modelo);
	public void setFranquiaPaginas(Integer franquiaPaginas);

	//public void setImpressoras(List<Impressora> impressoras); Implementação futura.
	

}
