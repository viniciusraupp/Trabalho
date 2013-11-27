package controle;

import entidade.Contrato;

public class ControleDoContrato {
	
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
}
