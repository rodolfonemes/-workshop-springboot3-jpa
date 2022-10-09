package br.com.rodolfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodolfo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
