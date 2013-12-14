package br.edu.ifrs.canoas.entidade;

import java.util.Date;

/**
 * Classe Contrato
 * @author Andre e Vinicius
 * 14/12/2013
 */
public class Contrato implements Negociavel {
	private String numContrato;
	private PessoaJuridica cliente;
	private Impressora impressoras;
	private Date dataInicio;
	private Date dataFim;
	private Double valorContrato;
	private Integer franquiaPaginas;

	public Contrato(String numcontrato) {
		if (numcontrato.length() > 0 && numcontrato.length() <= 10) {
			this.numContrato = numcontrato;
		}

	}

	public String getNumcontrato() {
		return numContrato;
	}

	public PessoaJuridica getCliente() {
		return cliente;
	}

	public void setCliente(PessoaJuridica cliente) {
		this.cliente = cliente;
	}

	public Impressora getImpressoras() {
		return impressoras;
	}
	
	public int getContadorPagImpressoras() {
		return impressoras.getContadorPaginas();
	}

	@Override
	public void adicionaImpressoras(String numSerie, String marca, String modelo) {
		if (numContrato.length() > 0 && numContrato.length() <= 10) {
			impressoras = new Impressora(numSerie);
		}
		if (numContrato.length() > 0 && numContrato.length() <= 8) {
			impressoras.setMarca(marca);
		}
		if (numContrato.length() > 0 && numContrato.length() <= 10) {
			impressoras.setModelo(modelo);
		}
	}

	public Date getDatainicio() {
		return dataInicio;
	}

	public void setDatainicio(Date datainicio) {
		this.dataInicio = datainicio;
	}

	public Date getDatafim() {
		return dataFim;
	}

	public void setDatafim(Date datafim) {
		this.dataFim = datafim;
	}

	public double getValorcontrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorcontrato) {
		if (this.valorContrato != null) {
			this.valorContrato = valorcontrato;
		}
	}

	public Integer getFranquiaPaginas() {
		return franquiaPaginas;
	}

	@Override
	public void setFranquiaPaginas(Integer franquiapaginas) {
		this.franquiaPaginas = franquiapaginas;
	}

	@Override
	public void adicionaCliente(String nome, String cnpj) {
		PessoaJuridica cliente = new PessoaJuridica();
		cliente.adicionaCliente(nome, cnpj);
	}
}
