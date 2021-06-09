package br.com.generation.arrays;
import java.util.*;
public class Aula04Ex03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int vetorMatriz[][] = new int[3][3], l, c, contador=0;
		

		for(l=0; l<vetorMatriz.length; l++) {
			for(c=0; c<vetorMatriz[l].length; c++) {
				System.out.println("Digite um valor: ");
				vetorMatriz[l][c] = ler.nextInt();
				
				if(vetorMatriz[l][c] > 10) {
					contador++;
				}
			
			}
		}

			
			System.out.println("A quantidade de valores maior que 10 é de: " + contador);
			
		}
}


