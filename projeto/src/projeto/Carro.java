package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro extends Veiculo{
	private String tipoCombustivel;
	private int numeroPortas;
	
	public Carro() {}
	
	public Carro(String marca, String modelo, int ano, String tipoCombustivel, int numeroPortas) {
		super(marca, modelo, ano);
		this.tipoCombustivel = tipoCombustivel;
		this.numeroPortas = numeroPortas;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public String toString() {
		return "Carro [tipoCombustivel=" + tipoCombustivel + ", numeroPortas=" + numeroPortas + "]";
	}
	
	public void cadastrar() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Cadastro de Carro: ");
			System.out.println("Marca: ");
			marca = scanner.nextLine();
			System.out.println("Ano: ");
			ano = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Tipo de Combustível: ");
			tipoCombustivel = scanner.nextLine();
			System.out.print("Número de Portas: ");
			numeroPortas = scanner.nextInt();
		}
		System.out.println("Carro cadastrado com sucesso!");
		
	}
	public void listar(ArrayList<Veiculo> veiculos) {
		System.out.println("Lista de Carros: ");
		for (Veiculo veiculo : veiculos) {
			if(veiculo instanceof Carro) {
				Carro carro = (Carro) veiculo;
				System.out.println("Marca: " + carro.marca + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.ano +
                        ", Combustível: " + carro.tipoCombustivel + ", Portas: " + carro.numeroPortas);
			}
		}
	}
	public void visualizar(ArrayList<Veiculo> veiculos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Visualizar Carro: ");
			System.out.println("Modelo do carro que deseja visualizar: ");
			String modeloDesejado = scanner.nextLine();
			for(Veiculo veiculo : veiculos) {
				if(veiculo instanceof Carro && ((Carro) veiculo).getModelo().equals(modeloDesejado)) {
				//	Carro carro = (Carro) veiculo;
					System.out.println("Marca: \" + carro.marca + \", Modelo: \" + carro.modelo + \", Ano: \" + carro.ano +\r\n" + "\", Combustível: \" + carro.tipoCombustivel + \", Portas: \" + carro.numeroPortas");
					return;
				}
			}
			System.out.println("Carro não encontrado.");
		}
	}
	public void excluir(ArrayList<Veiculo> veiculos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Excluir Carro:");
			System.out.println("Modelo do carro que deseja excluir: ");
			String modeloDesejado = scanner.nextLine();
			for (Veiculo veiculo : veiculos) {
			    if (veiculo instanceof Carro && ((Carro) veiculo).getModelo().equals(modeloDesejado)) {
			        veiculos.remove(veiculo);
			        System.out.println("Carro excluído com sucesso.");
			        return;
			    }
			}
		}
        System.out.println("Carro não encontrado.");
	}
	public void editar(ArrayList<Veiculo> veiculos) {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Editar Carro:");
	        System.out.print("Modelo do carro que deseja editar: ");
	        String modeloDesejado = scanner.nextLine();
	        for (Veiculo veiculo : veiculos) {
	            if (veiculo instanceof Carro && ((Carro) veiculo).getModelo().equals(modeloDesejado)) {
	                System.out.println("Editar os dados do carro:");
	                System.out.print("Nova Marca: ");
	                veiculo.marca = scanner.nextLine();
	                System.out.print("Novo Modelo: ");
	                veiculo.setModelo(scanner.nextLine());
	                System.out.print("Novo Ano: ");
	                veiculo.ano = scanner.nextInt();
	                scanner.nextLine(); // Limpar o buffer
	                System.out.print("Novo Tipo de Combustível: ");
	                ((Carro) veiculo).tipoCombustivel = scanner.nextLine();
	                System.out.print("Novo Número de Portas: ");
	                ((Carro) veiculo).numeroPortas = scanner.nextInt();
	                System.out.println("Carro editado com sucesso.");
	                return;
	            }
	        }
		}
	        System.out.println("Carro não encontrado.");
	  }
	}

//Justificativa: Carro é um tipo especifico de veiculo com caracteristicas proprias, como tipo de combustivel e numero de portas.
