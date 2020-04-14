package be.com.best2bee.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.com.best2bee.loja.controller.dto.ItemDaCompraDto;
import be.com.best2bee.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private CompraService compraService;

	@PostMapping
	public void realizaCompra(@RequestBody List<ItemDaCompraDto> compra) {
		System.out.println(compra);
		compraService.realizaPedido(compra);
	}
	
}
