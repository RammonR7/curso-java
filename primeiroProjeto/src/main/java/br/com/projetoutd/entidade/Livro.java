package br.com.projetoutd.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Notação Javax persistence
@Entity

public class Livro {
	
	@Id
	
	//Notação para Id ser autoincremento
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String titulo;
	private String autor;
	private int quantidade;
	private double preco;
	
	// Construtor vazio Livro
		public Livro () {
			
	}
		
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
