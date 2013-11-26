package controle;

import entidade.Impressora;

public class ControleDoContrato {
	private Integer franquiaPaginas;

	public int getFranquiaPaginas() {
		return franquiaPaginas;
	}

	public void setFranquiaPaginas(int franquiaPaginas) {
		this.franquiaPaginas = franquiaPaginas;
	}
	
	public void imprimir(Impressora impressora, int QtdPaginas){
		
	}
	
	public boolean trocarToner(Impressora impressora){
		return false;
		
	}
	
	public boolean trocarFusor(Impressora impressora){
		return false;
		
	}
}
