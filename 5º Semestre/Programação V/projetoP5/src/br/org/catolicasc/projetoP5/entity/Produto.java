package br.org.catolicasc.projetoP5.entity;

import javax.persistence.*;

import br.org.catolicasc.projetoP5.interfaces.Bean;

@Entity
public class Produto implements Bean{
	@Id @GeneratedValue
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private Double preco;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
