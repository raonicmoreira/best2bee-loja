package be.com.best2bee.loja.controller.dto;

public class ItemPedidoDto {

	private Long id;
	private Integer quantidade;
	private ProdutoPedidoDto produto;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public ProdutoPedidoDto getProduto() {
		return produto;
	}
	public void setProduto(ProdutoPedidoDto produto) {
		this.produto = produto;
	}
	
	
	
}
