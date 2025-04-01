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

				if (tamanho > 10){ tamanho = 10;}
				
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
					System.out.printf("%s --- R$ %.2f%n", vect[i].getNome(), vect[i].getPreco());
				}

				System.out.print("Qual produto deseja mudar o preco?: ");
				String nomeProduto = sc.next();

				for ( int i = 0; i < vect.length; i++){
					if ( vect[i].getNome().equals(nomeProduto)){
						System.out.println("Deseja adicionar ou diminuir o preço dos produtos? [a/d] ");
						String colocarProduto = sc.next();

						switch (colocarProduto) {
							case "a":
								System.out.printf("Digite o valor do %s: ", vect[i].getNome());
								vect[i].setPreco(sc.nextDouble());
								// imprime a lista completa dos produtos
								System.out.printf("%n");
								for (int j = 0; j<vect.length; j++) {
								System.out.printf("%s --- R$ %.2f%n", vect[j].getNome(), vect[j].getPreco());
								}
								break;
							case "d":
								System.out.printf("Digite o valor a ser retirado do %s: ", vect[i].getNome());
								double sub = sc.nextDouble();
								vect[i].setPreco(vect[i].getPreco() - sub);
								// imprime a lista completa dos produtos
								System.out.printf("%n");
								for (int j = 0; j<vect.length; j++) {
								System.out.printf("%s --- R$ %.2f%n", vect[j].getNome(), vect[j].getPreco());
								}
								break;

							default:
								break;
						} 
					}
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
