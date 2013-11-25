package entidade;

import java.util.List;

/**
 * Interface Negociavel
 * 
 * @author Andre e Vinícius 24/11/2013
 */
public interface Negociavel {

	public void adicionaCliente(String nome, String cnpj);

	public void setImpressoras(List<Impressora> impressoras);

}
