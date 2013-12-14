package br.edu.ifrs.canoas.entidade;

/**
 * Classe Insumo
 * 
 * @author Andre
 * @author Vinícius
 */
public class Insumo implements VidaUtil {
	private String tipo;
	private Integer vidaUtilIns;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVidaUtilIns() {
		return vidaUtilIns;
	}
	
	@Override
	public void vidaUtil(Integer num) {
		vidaUtilIns = num;

	}
	@Override
	public void reduzVidaUtil(Integer num) {
		vidaUtilIns=vidaUtilIns-num;
		
	}
	@Override
	public int getVidaUtil() {
		return vidaUtilIns;
	}

}
