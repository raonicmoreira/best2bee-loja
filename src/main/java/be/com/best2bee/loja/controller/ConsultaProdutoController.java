package be.com.best2bee.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.com.best2bee.loja.controller.dto.ConsultaProdutoDto;
import be.com.best2bee.loja.service.ConsultaProdutoService;

@RestController
@RequestMapping("/consulta")
public class ConsultaProdutoController {

	@Autowired
	private ConsultaProdutoService consultaProdutoService;
	
	
	@PostMapping
	public void consultaProduto(@RequestBody ConsultaProdutoDto consulta) {
		consultaProdutoService.consultaProduto(consulta);
		
	}
}
