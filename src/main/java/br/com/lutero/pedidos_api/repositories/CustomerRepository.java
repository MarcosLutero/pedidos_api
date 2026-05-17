package br.com.lutero.pedidos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lutero.pedidos_api.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
