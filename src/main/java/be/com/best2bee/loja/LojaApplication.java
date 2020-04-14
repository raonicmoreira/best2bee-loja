package be.com.best2bee.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class LojaApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LojaApplication.class, args);
	}
}
