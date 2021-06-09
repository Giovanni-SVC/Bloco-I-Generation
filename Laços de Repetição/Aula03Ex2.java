package br.com.generation.aula03ex02;
import java.util.*;

public class Aula03Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, contadorPar=0, contadorImpar=0;
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("Digite um número: ");
			n = ler.nextInt();

			if(n%2==0) {
				contadorPar++;
			}
				
				else{
					contadorImpar++;
				}
				
			}
		System.out.println("A quantidade de números pares: " + contadorPar);
		System.out.println("A quantidade de números ímpares: " + contadorImpar);
		}
		
	}


