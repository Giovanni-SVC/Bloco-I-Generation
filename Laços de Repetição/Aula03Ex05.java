package br.com.generation.aula03ex05;
import java.util.*;

public class Aula03Ex05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			n = ler.nextInt();
			
			soma+=n;
			
			
			
		} while(n!=0);
		
		System.out.println("A soma dos n�meros digitados foram de: " + soma);
	}
}
