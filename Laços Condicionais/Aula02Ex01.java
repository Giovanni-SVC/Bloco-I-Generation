package br.com.generation.lacoscondicionais;
import java.util.*;

public class Aula02Ex01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("O maior número é: " + num1);
		}
		
		else if (num2 > num1 && num2 > num3) {
			
			System.out.println("O maior número é: " + num2);
		}
		
		else {
			System.out.println("O maior número é: " + num3);
		}
	}

}
