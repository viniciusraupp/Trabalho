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
	private int contadorPaginas = 0;
	private Insumo toner;
	private Insumo fusor;
	private int vidaUtilImp;

	public String getNumserie() {
		return numserie;
	}

	public void setNumserie(String numserie) {
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

	public void setContadorPaginas(int contadorPaginas) {
		this.contadorPaginas = contadorPaginas;
	}

	public Insumo getToner() {
		return toner;
	}

	public void setToner(Insumo toner) {
		this.toner = toner;
	}

	public Insumo getFusor() {
		return fusor;
	}

	public void setFusor(Insumo fusor) {
		this.fusor = fusor;
	}

	@Override
	public void vidaUtil(int num) {
		vidaUtilImp = num;
	}

	@Override
	public void reduzVidaUtil(int num) {
		vidaUtilImp = vidaUtilImp - num;

	}

}
