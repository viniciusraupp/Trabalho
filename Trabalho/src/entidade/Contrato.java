package entidade;

import javax.xml.crypto.Data;

public class Contrato implements Negociavel {
	private String numContrato;
	private PessoaJuridica cliente;
	private Impressora impressoras;
	private Data dataInicio;
	private Data dataFim;
	private Double valorContrato;
	private Double franquiaPaginas;

	public Contrato(String numcontrato) {
		if (numcontrato.length() > 0 && numcontrato.length() <= 10) {
			this.numContrato = numcontrato;
		}

	}

	public String getNumcontrato() {
		return numContrato;
	}

	public void setNumcontrato(String numcontrato) {
		this.numContrato = numcontrato;
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

	public Data getDatainicio() {
		return dataInicio;
	}

	public void setDatainicio(Data datainicio) {
		this.dataInicio = datainicio;
	}

	public Data getDatafim() {
		return dataFim;
	}

	public void setDatafim(Data datafim) {
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

	public Double getFranquiaPaginas() {
		return franquiaPaginas;
	}

	@Override
	public void setFranquiaPaginas(Double franquiapaginas) {
		this.franquiaPaginas = franquiapaginas;
	}

	@Override
	public void adicionaCliente(String nome, String cnpj) {
		PessoaJuridica cliente = new PessoaJuridica();
		cliente.adicionaCliente(nome, cnpj);
	}
}
