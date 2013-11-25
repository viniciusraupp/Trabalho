package entidade;

/**
 * Interface Vida Util
 * 
 * @author Andre e Vin�cius 24/11/2013
 */
public interface VidaUtil {

	/**
	 * @param num
	 *            inicializa o contrador da vida �til.
	 */
	public void vidaUtil(int num);

	/**
	 * @param num
	 *            recebe quantas unidades ser� reduzida.
	 */
	public void reduzVidaUtil(int num);
	
	public int getVidaUtil();

}
