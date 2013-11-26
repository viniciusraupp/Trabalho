package controle;

import entidade.Impressora;

public class ControleDoContrato {
	private Integer franquiaPaginas;

	public int getFranquiaPaginas() {
		return franquiaPaginas;
	}

	public void setFranquiaPaginas(Integer franquiaPaginas) {
		this.franquiaPaginas = franquiaPaginas;
	}
	
	public void imprimir(Impressora impressora, Integer QtdPaginas){
		
	}
	
	public boolean trocarToner(Impressora impressora){
		return false;
		
	}
	
	public boolean trocarFusor(Impressora impressora){
		return false;
		
	}
}
