package br.com.generation.lacoscondicionais;
import java.util.*;

public class Aula02Ex01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("O maior n�mero �: " + num1);
		}
		
		else if (num2 > num1 && num2 > num3) {
			
			System.out.println("O maior n�mero �: " + num2);
		}
		
		else {
			System.out.println("O maior n�mero �: " + num3);
		}
	}

}
