package be.com.best2bee.loja.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import be.com.best2bee.loja.controller.dto.ItemDaCompraDto;
import be.com.best2bee.loja.controller.dto.ItemPedidoDto;
import be.com.best2bee.loja.controller.dto.PedidoDto;
import be.com.best2bee.loja.modelo.Item;
import be.com.best2bee.loja.modelo.Pedido;
import be.com.best2bee.loja.repository.PedidoRepository;

@Service
public class CompraService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

	@Value("${api.fornecedor.token}")
	private String authToken;
	RestTemplate client = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();

	public void realizaPedido(List<ItemDaCompraDto> itens) {

		LOG.info("Enviando pedido para fornecedor. ");
		headers.add("Authorization", "Bearer "+authToken);
		
		HttpEntity<List<ItemDaCompraDto>> request = new HttpEntity<>(itens, headers);
		
		
		PedidoDto resultado = client.postForObject( "http://localhost:8081/pedido",
				request, PedidoDto.class);
		
		List<ItemPedidoDto> itemRecebido = resultado.getItens();
		List<Item> itensPedido = new ArrayList<>();
		
		for (ItemPedidoDto itemPedidoDto : itemRecebido) {
			Item item = new Item(itemPedidoDto.getProduto().getNome(), itemPedidoDto.getQuantidade(),
									itemPedidoDto.getProduto().getPreco());
			itensPedido.add(item);
		
		}
		
		Pedido pedido = new Pedido(resultado.getId(), itensPedido);
		pedidoRepository.save(pedido);
		LOG.info("Pedido confirmado pelo fornecedor.");
		
	}

}
