package be.com.best2bee.loja.controller.dto;

import java.util.List;

public class PedidoDto {
	
	private Long id;
	private List<ItemPedidoDto> itens;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<ItemPedidoDto> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedidoDto> itens) {
		this.itens = itens;
	}
	
	

}
