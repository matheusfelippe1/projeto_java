package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Moto extends Veiculo{
	private int cilindrada;
	
	public Moto() {}
	
	public Moto(String marca, String modelo, int ano, int cilindrada) {
		super(marca, modelo, ano);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}

	public void cadastrar() {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Cadastro de Moto:");
	        System.out.print("Marca: ");
	        marca = scanner.nextLine();
	        System.out.print("Modelo: ");
	        setModelo(scanner.nextLine());
	        System.out.print("Ano: ");
	        ano = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Cilindrada: ");
	        cilindrada = scanner.nextInt();
		}
	        System.out.println("Moto cadastrada com sucesso!");
	}
	public void listar(ArrayList<Veiculo> veiculos) {
		System.out.println("Lista de Motos:");
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                System.out.println("Marca: " + moto.marca + ", Modelo: " + moto.getModelo() + ", Ano: " + moto.ano +
                        ", Cilindrada: " + moto.cilindrada);
            }
        }
	}
	public void visualizar(ArrayList<Veiculo> veiculos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Visualizar Moto:");
			System.out.print("Modelo da moto que deseja visualizar: ");
			String modeloDesejado = scanner.nextLine();
			for (Veiculo veiculo : veiculos) {
			    if (veiculo instanceof Moto && ((Moto) veiculo).getModelo().equals(modeloDesejado)) {
			        Moto moto = (Moto) veiculo;
			        System.out.println("Marca: " + moto.marca + ", Modelo: " + moto.getModelo() + ", Ano: " + moto.ano +
			                ", Cilindrada: " + moto.cilindrada);
			        return;
			    }
			}
		}
        System.out.println("Moto não encontrada.");
	}
	public void excluir(ArrayList<Veiculo> veiculos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Excluir Moto:");
			System.out.print("Modelo da moto que deseja excluir: ");
			String modeloDesejado = scanner.nextLine();
			for (Veiculo veiculo : veiculos) {
			    if (veiculo instanceof Moto && ((Moto) veiculo).getModelo().equals(modeloDesejado)) {
			        veiculos.remove(veiculo);
			        System.out.println("Moto excluída com sucesso.");
			        return;
			    }
			}
		}
        System.out.println("Moto não encontrada.");
	}
	public void editar(ArrayList<Veiculo> veiculos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Editar Moto:");
			System.out.print("Modelo da moto que deseja editar: ");
			String modeloDesejado = scanner.nextLine();
			for (Veiculo veiculo : veiculos) {
			    if (veiculo instanceof Moto && ((Moto) veiculo).getModelo().equals(modeloDesejado)) {
			        System.out.println("Editar os dados da moto:");
			        System.out.print("Nova Marca: ");
			        veiculo.marca = scanner.nextLine();
			        System.out.print("Novo Modelo: ");
			        veiculo.setModelo(scanner.nextLine());
			        System.out.print("Novo Ano: ");
			        veiculo.ano = scanner.nextInt();
			        scanner.nextLine();
			        System.out.print("Nova Cilindrada: ");
			        ((Moto) veiculo).cilindrada = scanner.nextInt();
			        System.out.println("Moto editada com sucesso.");
			        return;
			    }
			}
		}
        System.out.println("Moto não encontrada.");
    }
	
}

//Justificativa: Moto é outro tipo especifico de Veiculo com atributos particulares, como cilindrada
