package br.com.generation.poo.interfaces;

public class ImpressaoAnimais {
	
public static void main(String[] args) {
		
	Cachorro dog = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguica preguica = new Preguica();
	
	dog.setNome("Marmaduke");
	dog.setIdade(12);

	cavalo.setNome("Scadufax");
	cavalo.setIdade(400);


	preguica.setNome("Flash");
	preguica.setIdade(20);
	
	System.out.println("CACHORRO:");
	System.out.println("Nome do cachorro: "+ dog.getNome());
	System.out.println("Idade do cachorro: "+ dog.getIdade());
	dog.som();
	dog.escalar();
	dog.correr();
	System.out.println();
	
	System.out.println("CAVALO:");
	System.out.println("Nome do cavalo: "+ cavalo.getNome());
	System.out.println("Idade do cavalo: "+ cavalo.getIdade());
	cavalo.som();
	cavalo.correr();
	cavalo.escalar();
	System.out.println();

	
	System.out.println("PREGUIÇA:");
	System.out.println("Idade do bicho preguiça: "+ preguica.getIdade());
	System.out.println("Nome do bicho preguiça: "+ preguica.getNome());
	preguica.som();
	preguica.correr();
	preguica.escalar();


}

}
