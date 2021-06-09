package br.com.generation.lacoscondicionais;
import java.util.*;

public class Aula02Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; 
		 * se for ímpar exiba o número elevado ao quadrado.
		 */
		
		double numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		;
		
		if(numero %2==0) {
			
			System.out.println("O número digitado é par. A raiz quadrada dele é: " + Math.sqrt(numero));
		}
		
		else {
			System.out.println("O número digitado é ímpar. O número elevado ao quadrado é: " + Math.pow(numero, 2));
		}
	}

}
