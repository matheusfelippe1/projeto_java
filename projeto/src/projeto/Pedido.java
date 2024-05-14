package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	private int idPedido;
	private String descricao;
	private double valor;
	private Cliente cliente;
	private Cliente[] clientes;
	
	public Pedido () {}
	
	public Pedido(int idPedido, String descricao, double valor, Cliente cliente) {
		this.idPedido = idPedido;
		this.descricao = descricao;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descricao=" + descricao + ", valor=" + valor + ", cliente=" + cliente
				+ "]";
	}

	public void cadastrar() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Cadastro de Pedido:");
			System.out.print("ID do Pedido: ");
			idPedido = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer
			System.out.print("Descrição: ");
			descricao = scanner.nextLine();
			System.out.print("Valor: ");
			valor = scanner.nextDouble();
			scanner.nextLine(); // Limpar o buffer
			System.out.print("CPF do Cliente: ");
			String cpf = scanner.nextLine();
			// Encontrar o cliente com o CPF fornecido
			// Supondo que a lista de clientes seja passada como argumento
			for (Cliente c : clientes) {
			    if (c.getCpf().equals(cpf)) {
			        cliente = c;
			        System.out.println("Pedido cadastrado com sucesso!");
			        return;
			    }
			}
		}
        System.out.println("Cliente não encontrado. Pedido não cadastrado.");
	}
	public void listar(ArrayList<Pedido> pedidos) {
		System.out.println("Lista de Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("ID do Pedido: " + pedido.idPedido + ", Descrição: " + pedido.descricao +
                    ", Valor: " + pedido.valor + ", Cliente: " + pedido.cliente.getNome());
        }
	}
	public void visualizar(ArrayList<Pedido> pedidos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Visualizar Pedido:");
			System.out.print("ID do pedido que deseja visualizar: ");
			int idDesejado = scanner.nextInt();
			for (Pedido pedido : pedidos) {
			    if (pedido.idPedido == idDesejado) {
			        System.out.println("ID do Pedido: " + pedido.idPedido + ", Descrição: " + pedido.descricao +
			                ", Valor: " + pedido.valor + ", Cliente: " + pedido.cliente.getNome());
			        return;
			    }
			}
		}
        System.out.println("Pedido não encontrado.");
	}
	public void excluir(ArrayList<Pedido> pedidos) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Excluir Pedido:");
			System.out.print("ID do pedido que deseja excluir: ");
			int idDesejado = scanner.nextInt();
			for (Pedido pedido : pedidos) {
			    if (pedido.idPedido == idDesejado) {
			        pedidos.remove(pedido);
			        System.out.println("Pedido excluído com sucesso.");
			        return;
			    }
			}
		}
        System.out.println("Pedido não encontrado.");
	}
	public void editar(ArrayList<Pedido> pedidos) {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Editar Pedido:");
	        System.out.print("ID do pedido que deseja editar: ");
	        int idDesejado = scanner.nextInt();
	        for (Pedido pedido : pedidos) {
	            if (pedido.idPedido == idDesejado) {
	                System.out.println("Editar os dados do pedido:");
	                System.out.print("Nova Descrição: ");
	                pedido.descricao = scanner.nextLine();
	                System.out.print("Novo Valor: ");
	                pedido.valor = scanner.nextDouble();
	                scanner.nextLine(); // Limpar o buffer
	                System.out.println("Pedido editado com sucesso.");
	                return;
	            }
	        }
		}
	        System.out.println("Pedido não encontrado.");
	    }
}
