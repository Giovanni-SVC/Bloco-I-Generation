package br.com.generation.poo;

public class TesteAviao {
	public static void main(String[] args) {
	
	Aviao aviao = new Aviao();
	
	aviao.setModelo("Teco-Teco");
	aviao.setEmpresa("Embraer");
	aviao.setDestino("São Paulo");
	
	System.out.println("Modelo do avião: " + aviao.getModelo());
	System.out.println("Empresa: " + aviao.getEmpresa());
	System.out.println("Destino: " + aviao.getDestino());
	

}
}
