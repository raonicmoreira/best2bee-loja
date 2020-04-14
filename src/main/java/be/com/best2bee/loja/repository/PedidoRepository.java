package be.com.best2bee.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.com.best2bee.loja.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
