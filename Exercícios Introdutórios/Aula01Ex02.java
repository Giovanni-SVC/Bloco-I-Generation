package com.br.generation.aula01;
import java.util.Scanner;


public class Aula01Ex02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int diasDeVida, mesesDeVida, anosDeVida;
		
		System.out.println("Digite quantos dias de vida você tem: ");
		diasDeVida = entrada.nextInt();
		
		anosDeVida=(diasDeVida/365);
				
		mesesDeVida=(diasDeVida/30);
		
		System.out.println("Sua idade é de: " + anosDeVida + " anos, " + mesesDeVida + " meses e " + diasDeVida + " dias.");
		
		
		
	}

}
