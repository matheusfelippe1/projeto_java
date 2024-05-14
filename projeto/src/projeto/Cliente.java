package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}

	public void cadastrar() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Cadastro de Cliente:");
			System.out.print("Nome: ");
			nome = scanner.nextLine();
			System.out.print("CPF: ");
			cpf = scanner.nextLine();
			System.out.print("Endereço: ");
			endereco = scanner.nextLine();
		}
        System.out.println("Cliente cadastrado com sucesso!");
	}
	public void listar(ArrayList<Cliente> clientes) {
		 System.out.println("Lista de Clientes:");
	        for (Cliente cliente : clientes) {
	            System.out.println("Nome: " + cliente.nome + ", CPF: " + cliente.cpf + ", Endereço: " + cliente.endereco);
	        }
	}
	public void visualizar(ArrayList<Cliente> clientes) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Visualizar Cliente:");
			System.out.print("CPF do cliente que deseja visualizar: ");
			String cpfDesejado = scanner.nextLine();
			for (Cliente cliente : clientes) {
			    if (cliente.cpf.equals(cpfDesejado)) {
			        System.out.println("Nome: " + cliente.nome + ", CPF: " + cliente.cpf + ", Endereço: " + cliente.endereco);
			        return;
			    }
			}
		}
        System.out.println("Cliente não encontrado.");
	}
	public void excluir(ArrayList<Cliente> clientes) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Excluir Cliente:");
			System.out.print("CPF do cliente que deseja excluir: ");
			String cpfDesejado = scanner.nextLine();
			for (Cliente cliente : clientes) {
			    if (cliente.cpf.equals(cpfDesejado)) {
			        clientes.remove(cliente);
			        System.out.println("Cliente excluído com sucesso.");
			        return;
			    }
			}
		}
        System.out.println("Cliente não encontrado.");
	}
	public void editar(ArrayList<Cliente> clientes) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Editar Cliente:");
			System.out.print("CPF do cliente que deseja editar: ");
			String cpfDesejado = scanner.nextLine();
			for (Cliente cliente : clientes) {
			    if (cliente.cpf.equals(cpfDesejado)) {
			        System.out.println("Editar os dados do cliente:");
			        System.out.print("Novo Nome: ");
			        cliente.nome = scanner.nextLine();
			        System.out.print("Novo CPF: ");
			        cliente.cpf = scanner.nextLine();
			        System.out.print("Novo Endereço: ");
			        cliente.endereco = scanner.nextLine();
			        System.out.println("Cliente editado com sucesso.");
			        return;
			    }
			}
		}
        System.out.println("Cliente não encontrado.");
    }
}
