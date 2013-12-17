package br.edu.ifrs.canoas.entidade;

/**
 * Classe Orcamento
 * 
 * @author Andre e Vinicius
 * 
 *  4/11/2013
 */
public class Orcamento implements Negociavel {
	private String numOrcamento;
	private PessoaJuridica cliente;
	private Impressora impressoras;
	private String dataValidadeOrc;
	private Double valorOrc;
	private Integer franquiaPaginasOrc;

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

	public Integer getFranquiaPaginasOrc() {
		return franquiaPaginasOrc;
	}

	@Override
	public void setFranquiaPaginas(Integer franquiaPaginasOrc) {
		this.franquiaPaginasOrc = franquiaPaginasOrc;
	}

	@Override
	public void adicionaImpressoras(String numSerie, String marca, String modelo) {
		if (numOrcamento.length() > 0 && numOrcamento.length() <= 10) {
			impressoras = new Impressora(numSerie);
		}
		if (numOrcamento.length() > 0 && numOrcamento.length() <= 8) {
			impressoras.setMarca(marca);
		}
		if (numOrcamento.length() > 0 && numOrcamento.length() <= 10) {
			impressoras.setModelo(modelo);
		}
	}

	@Override
	public void adicionaCliente(String nome, String cnpj) {
		
	}

}
