package controle;

import entidade.Contrato;
import entidade.Impressora;

public class ControleDoContrato {
	//private Integer franquiaPaginas;
	private Contrato contrato;

	public void adicionaContrato(String numContrato, String nome, String cnpj,
			String numSerie, String marca, String modelo) {
		contrato = new Contrato(numContrato);
		contrato.adicionaCliente(nome, cnpj);
		contrato.adicionaImpressoras(numSerie, marca, modelo);

	}

	public void setFranquiaPaginas(Integer franquiaPaginas) {
		contrato.setFranquiaPaginas(franquiaPaginas);
	}

	public void imprimir(Impressora impressora, Integer QtdPaginas) {

	}

	public boolean trocarToner(Impressora impressora) {
		return false;

	}

	public boolean trocarFusor(Impressora impressora) {
		return false;

	}
}
