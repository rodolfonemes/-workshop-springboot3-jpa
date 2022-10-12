package br.com.rodolfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodolfo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
