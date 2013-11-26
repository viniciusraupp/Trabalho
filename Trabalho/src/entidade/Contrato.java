package entidade;

public class Contrato implements Negociavel {
	private String numcontrato;
	private PessoaJuridica cliente; // private List<Impressora> impressoras =
									// new ArrayList<Impressora>();
	// Implementação futura.
	private Impressora impressoras; // Retirar quando a implementação de
									// Collections funcionar.
	private String datainicio;
	private String datafim;
	private Double valorcontrato;
	private Integer franquiapaginas;
	private static Integer numTotalContratos; // Atributo static

	public Contrato(String numcontrato) {
		this.numcontrato = numcontrato;
		// Método static
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

	/**
	 * @return the impressoras
	 */
	public Impressora getImpressoras() {
		return impressoras;
	}

	/**
	 * @param impressoras
	 *            the impressoras to set
	 */
	@Override
	public void adicionaImpressoras(String numSerie, String marca, String modelo) {
		impressoras = new Impressora(numSerie);
		impressoras.setMarca(marca);
		impressoras.setModelo(modelo);
		// impressoras.adicionaInsumo(tipo, tempoVidaUtil);

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

	public int getFranquiaPaginas() {
		return franquiapaginas;
	}

	@Override
	public void setFranquiaPaginas(Integer franquiapaginas) {
		this.franquiapaginas = franquiapaginas;
	}

	@Override
	public void adicionaCliente(String nome, String cnpj) {
		PessoaJuridica cliente = new PessoaJuridica();
		cliente.adicionaCliente(nome, cnpj);
	}

}
