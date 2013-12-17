package br.edu.ifrs.canoas.controle;

import br.edu.ifrs.canoas.entidade.Contrato;

/**
 * Classe Controle do Contrato
 * 
 * @author Andre e Vinicius
 * 
 * 20/11/2013
 */
public class ControleDoContrato {

	private Contrato contrato;
	private Double totalPagar;
	private Double valPorExcedente;

	public void TotalPagar() {
		
		if (contrato.getContadorPagImpressoras() >= contrato.getFranquiaPaginas()) {
			this.setTotalPagar((contrato.getValorcontrato()
					+ contrato.getContadorPagImpressoras()
					- contrato.getFranquiaPaginas()) * valPorExcedente);
		} else {
			this.setTotalPagar(contrato.getValorcontrato());
		}
	}
	
	public Double getTotalPagar() {
		return valPorExcedente;
	}

	public Double getValPorExcedente() {
		return valPorExcedente;
	}

	public void setValPorExcedente(Double valPorExcedente) {
		this.valPorExcedente = valPorExcedente;
	}

	public void setTotalPagar(Double totalPagar) {
		this.totalPagar = totalPagar;
	}

}
