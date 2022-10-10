package br.com.rodolfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodolfo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
