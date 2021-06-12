package br.com.generation.poo.collections;

import java.util.ArrayList;

public class Estoque {
	
	private String nome;
	private String marca;
	private String tamanho;
	
	public Estoque(String nome, String marca, String tamanho) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString() {
		return "Produto: " + this.nome + " Marca: " + this.marca + " Tamanho: " + this.tamanho;
	}
	
	
	
	

}
