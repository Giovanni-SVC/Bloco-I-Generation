package br.com.generation.poo.collections;
import java.util.*;
import java.util.ArrayList;

public class TestaCollections1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int menu, escolha, numProduto = 0;
		String camisetas, calcados, moletons, produto, nome, marca, tamanho;
		String produto1 = "Camisetas";
		String produto2 = "Cal�ados";
		String produto3 = "Moletons";
		
		ArrayList<Estoque> produtos = new ArrayList<>();
		do {
		
		System.out.println("\n1: Adicionar produto.  \n2: Mostrar a Lista  \n3: Remover \nDigite 0 para sair");
		menu = leia.nextInt();
		
		
		int qntdProdutos = 0;
		
		if(menu==1) {
			
			System.out.println("Op��o Camisetas: Digite 1 \nOp��o Cal�ados Digite 2 \nOp��o Moletons: Digite 3");
			numProduto = leia.nextInt();
			System.out.println("Quantos Produtos voce deseja adicionar? ");
			qntdProdutos = leia.nextInt();
		
		
			
		if(numProduto==1) {
				
				for (int i = 0; i < qntdProdutos; i++) {
				
				System.out.println("Digite o nome da camiseta: ");
				nome = leia.next();
				System.out.println("Digite a marca da camiseta: ");
				marca = leia.next();
				System.out.println("Digite o tamanho da camiseta: ");
				tamanho = leia.next();
				
				produtos.add(new Estoque(nome, marca, tamanho));
				

				}
			}
			
			
		if(numProduto==2) {
				for (int i = 0; i < qntdProdutos; i++) {
				System.out.println("Digite o nome do cal�ado: ");
				nome = leia.next();
				System.out.println("Digite a marca do cal�ado: ");
				marca = leia.next();
				System.out.println("Digite o tamanho do cal�ado: ");
				tamanho = leia.next();
				
				produtos.add(new Estoque(nome, marca, tamanho));
				}
			}
			
		if(numProduto==3) {
				for (int i = 0; i < qntdProdutos; i++) {
				System.out.println("Digite o nome do moletom: ");
				nome = leia.next();
				System.out.println("Digite a marca do moletom: ");
				marca = leia.next();
				System.out.println("Digite o tamanho do moletom: ");
				tamanho = leia.next();
				
				produtos.add(new Estoque(nome, marca, tamanho));
				}
			} 
		}
			
			 if (menu==2) {
				 for (Estoque prod1 : produtos) {
			 
						System.out.println(produtos);
	}
}
			 
			 if (menu==3) {
					for (int i = 0; i < produtos.size(); i++) {
						System.out.println(i + " - " + produtos.get(i));
					}

					System.out.println("Qual produto voc� deseja remover? Digite o n�mero da posi��o");
					int excluir = leia.nextInt();
					produtos.remove(excluir);
			 }

	} while(menu!=0);
}
}


