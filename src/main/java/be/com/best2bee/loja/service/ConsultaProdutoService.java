package be.com.best2bee.loja.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import be.com.best2bee.loja.controller.dto.ConsultaProdutoDto;
import be.com.best2bee.loja.controller.dto.ProdutoDto;

@Service
public class ConsultaProdutoService {

	private static final Logger LOG = LoggerFactory.getLogger(ConsultaProdutoService.class);
	
	@Value("${api.fornecedor.token}")
	private String authToken;
	RestTemplate client = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();
	
	
	
	public void consultaProduto(ConsultaProdutoDto produto) {
		LOG.info("Consultando preço do produto : ",produto.getNome());
		headers.add("Authorization", "Bearer "+authToken);
		ResponseEntity<ProdutoDto> exchange = 
				client.exchange("http://localhost:8081/produtos/"+produto.getNome(),
				HttpMethod.GET, 
				new HttpEntity<>("parameters", headers), ProdutoDto.class);
		
		System.out.println("O valor do Produto é : R$ " + exchange.getBody().getPreco());
	}

	
}
