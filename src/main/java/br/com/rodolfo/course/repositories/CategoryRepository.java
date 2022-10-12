package br.com.rodolfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodolfo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
