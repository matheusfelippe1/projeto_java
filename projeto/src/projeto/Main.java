package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Listar Veículos");
            System.out.println("4. Visualizar Veículo");
            System.out.println("5. Excluir Veículo");
            System.out.println("6. Editar Veículo");
            System.out.println("7. Cadastrar Cliente");
            System.out.println("8. Listar Clientes");
            System.out.println("9. Visualizar Cliente");
            System.out.println("10. Excluir Cliente");
            System.out.println("11. Editar Cliente");
            System.out.println("12. Cadastrar Pedido");
            System.out.println("13. Listar Pedidos");
            System.out.println("14. Visualizar Pedido");
            System.out.println("15. Excluir Pedido");
            System.out.println("16. Editar Pedido");
            System.out.println("17. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            
            
        }
        
	}

}
