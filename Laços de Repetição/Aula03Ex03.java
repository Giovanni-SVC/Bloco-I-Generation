package br.com.generation.aula03ex03;
import java.util.*;

public class Aula03Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade=0, contadorMenor=0, contadorMaior=0;

		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			
			if(idade<21) {
				contadorMenor++;
			}
				
				else if(idade>50) {
					contadorMaior++;
			}
			
		}
		
		
		System.out.println("Total de menores de 21 anos: " + contadorMenor);
		System.out.println("Total de maiores de 50 anos: " + contadorMaior);
		
		
		
	}

}
