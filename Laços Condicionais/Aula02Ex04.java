package br.com.generation.lacoscondicionais;
import java.util.*;

public class Aula02Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		;
		
		if(numero %2==0) {
			
			System.out.println("O n�mero digitado � par. A raiz quadrada dele �: " + Math.sqrt(numero));
		}
		
		else {
			System.out.println("O n�mero digitado � �mpar. O n�mero elevado ao quadrado �: " + Math.pow(numero, 2));
		}
	}

}
