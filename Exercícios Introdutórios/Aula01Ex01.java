package com.br.generation.aula01;
import java.util.Scanner;

public class Aula01Ex01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double notaUm, notaDois, notaTres, media;
		
		System.out.println("Digite a primeira nota: ");
		notaUm = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		notaDois = entrada.nextDouble();
		
		System.out.println("Digite a nota três: ");
		notaTres = entrada.nextDouble();
		
		media=((notaUm*2) + (notaDois*3) + (notaTres*5));
		
		System.out.println("A média é: " + media/10);
		
		
	}

}
