package br.com.generation.aula03ex06;
import java.util.*;

public class Aula03Ex06 {

	public static void main(String[] args) { 
		Scanner ler = new Scanner (System.in);
		
		int num, media=0, contadorM=0;
		
		do{
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
			if(num%3==0) {
				contadorM++;
				
				media=(num+contadorM)/contadorM;
			}
			else if (num==0) {
				System.out.println("Os n�meros m�ltiplos de 3 foram: " + contadorM);
				
				System.out.println("A m�dia deles � igual a " + media);
			}
			
		}while(num>0);
		
		
			
	}
}
