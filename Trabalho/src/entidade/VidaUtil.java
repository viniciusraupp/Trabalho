package entidade;

/**
 * Interface Vida Util
 * 
 * @author Andre e Vin�cius 24/11/2013
 */
public interface VidaUtil {

	// @param num inicializa o contador da vida �til.
	public void vidaUtil(Integer num);

	// @param num recebe quantas unidades ser� reduzida.
	public void reduzVidaUtil(Integer num);
	
	public int getVidaUtil();

}
