package br.com.generation.arrays;
import java.util.*;
public class Aula04Ex02 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num[] = new int[6], i, somaPar=0, contImpar=0;
		String par = "", impar = "";
		
		System.out.println("Digite 6 números inteiros: ");
		
		for(i=0; i<num.length; i++) {
			num[i] = ler.nextInt();

				if(num[i]%2==0) {
					par=par+ " | " + num[i];
					somaPar=somaPar + num[i];
				}
					
				else {
					contImpar++;
				}
		}
		
		System.out.println("Os pares digitados: " + par + " | ");
		System.out.println("Soma pares: " + somaPar);
		System.out.println("Quantidade de ímpares: " + contImpar);
		}
}


