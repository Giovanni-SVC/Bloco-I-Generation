package br.com.generation.poo;

public class TesteAviao {
	public static void main(String[] args) {
	
	Aviao aviao = new Aviao();
	
	aviao.setModelo("Teco-Teco");
	aviao.setEmpresa("Embraer");
	aviao.setDestino("S�o Paulo");
	
	System.out.println("Modelo do avi�o: " + aviao.getModelo());
	System.out.println("Empresa: " + aviao.getEmpresa());
	System.out.println("Destino: " + aviao.getDestino());
	

}
}
