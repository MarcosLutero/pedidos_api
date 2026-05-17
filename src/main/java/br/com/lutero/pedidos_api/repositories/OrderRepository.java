package br.com.lutero.pedidos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lutero.pedidos_api.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
