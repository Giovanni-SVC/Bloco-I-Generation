package com.br.generation.aula01;
import java.util.Scanner;

public class Aula01Ex07 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = entrada.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = entrada.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = entrada.nextDouble();
		
		x = (c*e)-(b*f)/(a*e)-(b*d);
		y = (a*f)-(c+d)/(a*e)-(b*d);
		
		System.out.println("O valor de X � " + x);
		System.out.println("O valor de Y � " + y);
	}

}
