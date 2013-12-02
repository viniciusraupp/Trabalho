package controle;

import entidade.Contrato;
import entidade.Impressora;

/**
 * @author Andre e Vinicius 20/11/2013
 */
public class ControleDoContrato {

	private Contrato contrato;
	private Impressora impressora;
	private Double totalPagar;
	private Integer valPorExcedente;

	public void getTotalPagar() {
		if (impressora.getContadorPaginas() >= contrato.getFranquiaPaginas()) {
			totalPagar = (contrato.getValorcontrato()
					+ impressora.getContadorPaginas()
					- contrato.getFranquiaPaginas()) * valPorExcedente;
		} else {
			totalPagar = contrato.getValorcontrato();
		}
	}

	public Integer getValPorExcedente() {
		return valPorExcedente;
	}

	public void setValPorExcedente(Integer valPorExcedente) {
		this.valPorExcedente = valPorExcedente;
	}

}
