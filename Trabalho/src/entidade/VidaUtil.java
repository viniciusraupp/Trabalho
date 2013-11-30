package entidade;

/**
 * Interface Vida Util
 * 
 * @author Andre e Vinícius 24/11/2013
 */
public interface VidaUtil {

	// @param num inicializa o contador da vida útil.
	public void vidaUtil(Integer num);

	// @param num recebe quantas unidades será reduzida.
	public void reduzVidaUtil(Integer num);
	
	public int getVidaUtil();

}
