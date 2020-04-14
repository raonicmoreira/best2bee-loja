package be.com.best2bee.loja.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long numeroPedido;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pedidoId")
	private List<Item> itens;
	
	public Pedido() {
	}
	
	public Pedido(Long numeroPedido, List<Item> itens) {
		this.numeroPedido = numeroPedido;
		this.itens = itens;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numeroPedido=" + numeroPedido + ", itens=" + itens + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Long numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
	
}
