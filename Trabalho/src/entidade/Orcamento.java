/**
 * 
 */
package entidade;

import java.util.List;

/**
 * Classe Orcamento
 * 
 * @author Andre e Vinícius
 * 24/11/2013
 */
public class Orcamento implements Negociavel{
	private String numOrcamento;
	private PessoaJuridica cliente;
	private List<Impressora> impressoras;
	private String dataValidadeOrc;
	private double valorOrc;
	private int franquiaPaginasOrc;
	
	public String getNumOrcamento() {
		return numOrcamento;
	}
	public void setNumOrcamento(String numOrcamento) {
		this.numOrcamento = numOrcamento;
	}
	public PessoaJuridica getCliente() {
		return cliente;
	}
	public void setCliente(PessoaJuridica cliente) {
		this.cliente = cliente;
	}
	public List<Impressora> getImpressoras() {
		return impressoras;
	}
	
	public String getDataValidadeOrc() {
		return dataValidadeOrc;
	}
	public void setDataValidadeOrc(String dataValidadeOrc) {
		this.dataValidadeOrc = dataValidadeOrc;
	}
	public double getValorOrc() {
		return valorOrc;
	}
	public void setValorOrc(double valorOrc) {
		this.valorOrc = valorOrc;
	}
	public int getFranquiaPaginasOrc() {
		return franquiaPaginasOrc;
	}
	public void setFranquiaPaginasOrc(int franquiaPaginasOrc) {
		this.franquiaPaginasOrc = franquiaPaginasOrc;
	}
	
	@Override
	public void adicionaCliente(String nome, String cnpj) {
		PessoaJuridica cliente = new PessoaJuridica();
		cliente.adicionaCliente(nome, cnpj);		
	}

	@Override
	public void setImpressoras(List<Impressora> impressoras) {
		this.impressoras = impressoras;
	}
	
	
	
}
