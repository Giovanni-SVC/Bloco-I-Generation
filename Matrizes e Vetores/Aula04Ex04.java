package br.com.generation.arrays;
import java.util.*;

public class Aula04Ex04 {
	
	public static void main(String[] args) {
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		int escolha = 0;
		double constante;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira os n�meros da Matriz 1: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				matriz1[l][c] = entrada.nextDouble();
			}

		}

		System.out.println("Insira os n�meros da Matriz 2: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				matriz2[l][c] = entrada.nextDouble();
			}

		}

		System.out.println("Escolha uma das op��es: \n1 - Somar as duas matrizes, \n2 - Para subtrair as matrizes"
				+ " \n3 - Para adicionar uma constante as duas matrizes e \n4 - Para imprimir as matrizes");

		escolha = entrada.nextInt();
		
		if (escolha == 1) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {

					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
				}
			}

			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println("O resultado da soma da matriz 1 e 2 �: " + matriz3[l][c]);
				}
			}

		}
		
		if (escolha == 2) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {

					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
				}
			}

			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println("O resultado da subtra��o das matrizes �: " + matriz3[l][c]);
				}
			}

		}
	
	
	if (escolha == 3) {
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Digite um valor que ser� somado com os valores nas matrizes: ");
				constante = entrada.nextInt();

				matriz3[l][c] = matriz1[l][c] + matriz2[l][c] + constante;
			}
		}
	

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("O resultado da adi��o com a constante �: " + matriz3[l][c]);
			}
		}
	}
	
	if (escolha == 4) {
		
		System.out.println("Matriz 2: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				
				System.out.printf("[ " + matriz1[l][c] + " ] ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz 2: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				
				System.out.printf("[ " + matriz2[l][c] + " ] ");	
			}
			System.out.println();
				
			}
		}
	}
}


