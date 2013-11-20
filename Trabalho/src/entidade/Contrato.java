package entidade;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private int numcontrato;
	PessoaJuridica cliente;
	ArrayList<Impressora> impressoras = new ArrayList<Impressora>();
	private String datainicio;
	private int validade;
	private int valorcontrato;
	
	public int getNumcontrato() {
		return numcontrato;
	}
	public void setNumcontrato(int numcontrato) {
		this.numcontrato = numcontrato;
	}
	
	public PessoaJuridica getCliente() {
		return cliente;
	}
	public void setCliente(PessoaJuridica cliente) {
		this.cliente = cliente;
	}
	public String getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	public int getValorcontrato() {
		return valorcontrato;
	}
	public void setValorcontrato(int valorcontrato) {
		this.valorcontrato = valorcontrato;
	}
	
	public void adicionaCliente(Cliente cliente){
		
	}
	
	public void adicionaImpressora(Impressora impressora){
		
	}
	
	public void adicionaContrato(){
		
	}
	
}
