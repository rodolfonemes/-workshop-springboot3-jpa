package br.com.rodolfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodolfo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
