package program;

import java.util.Scanner;
import produtos.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Entrar ou sair do programa
		System.out.printf("Entrar no programa - 1%nSair do programa - 2%n-> ");
		int sistema = sc.nextInt();
		
		switch (sistema) {
			case 1:
				System.out.println("O sistema de gerenciamento tem um limite de 10 itens");
				System.out.println("Digite um numero entre 0 e 10 para iniciar a lista");
				System.out.print("-> ");
				int tamanho = sc.nextInt();
				
				Product[] vect = new Product[tamanho];
				
				// Adiciona um produto e um preco a cada indice do vetor
				for (int i = 0; i<vect.length; i++) {
					sc.nextLine();
					System.out.print("Digite o nome no produto: ");
					String nome = sc.nextLine();
					
					System.out.print("Digite o preco do produto: ");
					double preco = sc.nextDouble();
					vect[i] = new Product(nome, preco);
				}
				
				// imprime a lista completa dos produtos
				System.out.printf("%n");
				for (int i = 0; i<vect.length; i++) {
					System.out.printf("%s --- $R %.2f%n", vect[i].getNome(), vect[i].getPreco());
				}
				break;

			// Fecha o programa
			case 2:
				System.out.print("Fechando o programa...");
				System.exit(0);

			default:
				break;
		}

		
	}
}
