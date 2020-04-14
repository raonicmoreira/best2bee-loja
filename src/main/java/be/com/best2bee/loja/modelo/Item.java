package be.com.best2bee.loja.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeProduto;
	private Integer quantidade;
	private Double preco;
	
	public Item() {
	}
	
	public Item(String nomeProduto, int quantidade, Double preco) {
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", nomeProduto=" + nomeProduto + ", quantidade=" + quantidade + ", preco=" + preco
				+ "]";
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
