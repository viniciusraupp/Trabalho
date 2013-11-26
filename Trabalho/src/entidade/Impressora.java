package entidade;

/**
 * Classe Impressora
 * 
 * @author Andre
 * @author Vinícius
 */
public class Impressora implements VidaUtil {
	private String numserie;
	private String marca;
	private String modelo;
	private Integer contadorPaginas = 0;
	private Insumo insumo;
		private Integer vidaUtilImp;

	public String getNumserie() {
		return numserie;
	}

	public Impressora(String numserie) {
		this.numserie = numserie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getContadorPaginas() {
		return contadorPaginas;
	}

	public void setContadorPaginas(Integer contadorPaginas) {
		this.contadorPaginas = contadorPaginas;
	}

	public void adicionaInsumo(String tipo,Integer tempoVidaUtil){
		insumo = new Insumo();
		insumo.setTipo(tipo);
		insumo.vidaUtil(tempoVidaUtil);
	}

	/*
	 * Vida util da impressora.
	 */
	@Override
	public void vidaUtil(Integer num) {
		vidaUtilImp = num;
	}

	/*
	 * Redução da Vida util da impressora.
	 */
	@Override
	public void reduzVidaUtil(Integer num) {
		vidaUtilImp = vidaUtilImp - num;

	}

	@Override
	public int getVidaUtil() {
		return vidaUtilImp;
	}

}
