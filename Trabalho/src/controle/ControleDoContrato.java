package controle;

import entidade.Contrato;
import entidade.Impressora;

/**
 * @author Andre e Vinicius 20/11/2013
 */
public class ControleDoContrato {

	private Contrato contrato;
	private Double totalPagar;
	private Double valPorExcedente;

	public void TotalPagar() {
		
		if (contrato.getContadorPagImpressoras() >= contrato.getFranquiaPaginas()) {
			this.totalPagar = (contrato.getValorcontrato()
					+ contrato.getContadorPagImpressoras()
					- contrato.getFranquiaPaginas()) * valPorExcedente;
		} else {
			this.totalPagar = contrato.getValorcontrato();
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

}
