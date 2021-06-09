package br.com.generation.poo;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente cli = new Cliente(); 
		
		cli.setNome("Pedro");
		cli.setIdade(35);
		cli.setAssinatura("Free");
		
		System.out.println("Cliente: " + cli.getNome());;
		System.out.println("Idade do cliente: " + cli.getIdade());;
		System.out.println("Assinatura: " + cli.getAssinatura());;
		
		
	}
	
	

}
