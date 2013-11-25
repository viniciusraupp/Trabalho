package entidade;

/**
 * Classe Insumo
 * 
 * @author Andre
 * @author Vinícius
 */
public class Insumo implements VidaUtil {
	private String tipo;
	private int vidaUtilIns;

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
	public void vidaUtil(int num) {
		vidaUtilIns = num;

	}
	@Override
	public void reduzVidaUtil(int num) {
		vidaUtilIns=vidaUtilIns-num;
		
	}
	@Override
	public int getVidaUtil() {
		// TODO Auto-generated method stub
		return vidaUtilIns;
	}

}
