package br.com.generation.lacoscondicionais;
import java.util.*;

public class Aula02Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		 			*/
		
		int idade; 
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria: Infantil.");
			
		}
		
		else if(idade>=15 && idade<=17) {
			System.out.println("Categoria: Juvenil.");
		}
		
		else if(idade>=18 && idade<=25) {
			System.out.println("Categoria: Adulto.");
		}
		
		else {
			System.out.println("Desculpe, a idade informada não se enquadra em nenhuma categoria. Tente novamente.");
		}
		
		
	}

}
