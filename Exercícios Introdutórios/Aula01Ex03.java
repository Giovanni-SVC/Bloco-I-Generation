package com.br.generation.aula01;
import java.util.Scanner;


public class Aula01Ex03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int segundos, minutos, horas;
		
		
		System.out.println("Digite a quantidade de segundos: ");
		segundos = entrada.nextInt();
		
		
		minutos = segundos/60;
		horas = minutos/60;
		
		System.out.println("O tempo tota do evento foi de: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
	}

}
