package projeto;

import java.util.ArrayList;

public abstract class Veiculo {
	public String marca;
	private String modelo;
	protected int ano;
	
	public abstract void cadastrar();
	public abstract void listar(ArrayList<Veiculo> veiculos);
	public abstract void visualizar(ArrayList<Veiculo> veiculos);
	public abstract void excluir(ArrayList<Veiculo> veiculos);
	public abstract void editar(ArrayList<Veiculo> veiculos);
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
	
}
