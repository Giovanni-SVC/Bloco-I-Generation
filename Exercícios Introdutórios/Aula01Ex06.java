package com.br.generation.aula01;
import java.util.Scanner;
import java.math.MathContext;


public class Aula01Ex06 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2, p;
		
		System.out.println("Digite o valor de X1: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y1: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X2: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y2: ");
		y2 = entrada.nextDouble();
		
		p = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + 2);
		
		System.out.println("A dist�ncia entre os n�meros � de " + p);
	}

}
