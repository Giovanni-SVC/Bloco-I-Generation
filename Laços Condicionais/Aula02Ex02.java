package br.com.generation.lacoscondicionais;
import java.util.*;

import java.util.Scanner;

public class Aula02Ex02 {
	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
		
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		int num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		
		if(num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println("A ordem crescente � " + num1 + " " + num2 + " " + num3);
		}
		
		else if(num1 < num2 && num1 < num3 && num3 < num2) {
			System.out.println("A ordem crescente � " + num1 + " " + num3 + " " + num2);
;
		}
			
		else if(num2 < num1 && num2 < num3 && num1 < num3) {
			System.out.println("A ordem crescente �: " + num2 + " " + num1 + " " + num3);
			
		}
		
		else if(num2 < num1 && num2 < num3 && num3 < num1) {
			System.out.println("A ordem crescente � " + num2 + " " + num3 + " " + num1);

		}
		
		else if(num3 < num1 && num3 < num2 && num2 < num1) {
			System.out.println("A ordem crescente � " + num3 + " " + num2 + " " + num1);
			
		}
		
		else if(num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("O maior n�mero �: " + num3 + " " + num1 + " " + num2);
		}
		
		else {
			System.out.println("N�mero inv�lido");
		}
	}

	}

