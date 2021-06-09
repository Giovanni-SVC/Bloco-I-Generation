package br.generation.aula03ex04;
import java.util.*;

public class Aula03Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i=0, idade, sexo, personalidade, persoCalma=0, mN=0, hA=0, oC=0, idN=0, idC=0;
		String nome = "Nome";
		
		while(i<2) {
			
			System.out.println("Idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite o sexo: 1 - Masculino / 2 - Feminino / 3 - Outros");
			sexo = ler.nextInt();
			
			System.out.println("Digite a personalidade: 1 - Calma / 2 - Nervosa / 3 - Agressiva");
			personalidade = ler.nextInt();
			
			if(personalidade==1) {
				persoCalma++; //Personalidade calma
			}
			if(personalidade==2 && sexo==2) {
				mN++; //Mulheres nervosas
			}
			if(personalidade==3 && sexo==1) {
				hA++; //Homens agressivos
			}
			if(personalidade==1 && sexo==3) {
				oC++; //Outros calmos
			}
			
			if(idade>40 && personalidade==2) {
				idN++; //Maiores de 40 nervosos
			}
			
			if(idade<18 && personalidade==1) {
				idC++; //Menores de 18 calmos
			}
			i++;

		}
		
		System.out.println("o número de pessoas calmas: " + persoCalma);
		System.out.println("o número de mulheres nervosas: " + mN);
		System.out.println("o número de homens agressivos: " + hA);
		System.out.println("o número de outros calmos; " + oC);
		System.out.println("o número de pessoas nervosas com mais de 40 anos: "+ idN);
		System.out.println("o número de pessoas calmas com menos de 18 anos: " + idC);
	}

}
