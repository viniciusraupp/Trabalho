package entidade;

/**
 * Classe Contrato
 * 
 * @author Andre
 * @author Vin�cius
 * ${tags}
 */
import java.util.ArrayList;
import java.util.List;

public class Contrato implements Negociavel {
	private String numcontrato;
	private PessoaJuridica cliente;
	private List<Impressora> impressoras = new ArrayList<Impressora>();
	private String datainicio;
	private String datafim;
	private Double valorcontrato;
	private Integer franquiapaginas;
	private static Integer numTotalContratos;

	/**
	 * M�todo static 
	 */
	private Contrato() {
		Contrato.numTotalContratos = Contrato.numTotalContratos + 1;
	}

	public static Integer getTotalContratos() {
		return numTotalContratos;
	}

	public String getNumcontrato() {
		return numcontrato;
	}

	public void setNumcontrato(String numcontrato) {
		this.numcontrato = numcontrato;
	}

	public PessoaJuridica getCliente() {
		return cliente;
	}

	public void setCliente(PessoaJuridica cliente) {
		this.cliente = cliente;
	}

	public List<Impressora> getImpressoras() {
		return impressoras;
	}

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatafim() {
		return datafim;
	}

	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}

	public double getValorcontrato() {
		return valorcontrato;
	}

	public void setValorcontrato(Double valorcontrato) {
		this.valorcontrato = valorcontrato;
	}

	public int getFranquiapaginas() {
		return franquiapaginas;
	}

	public void setFranquiapaginas(Integer franquiapaginas) {
		this.franquiapaginas = franquiapaginas;
	}

	@Override
	public void adicionaCliente(String nome, String cnpj) {
		PessoaJuridica cliente = new PessoaJuridica();
		cliente.adicionaCliente(nome, cnpj);
	}

	@Override
	public void setImpressoras(List<Impressora> impressoras) {
		this.impressoras = impressoras;
	}

}
