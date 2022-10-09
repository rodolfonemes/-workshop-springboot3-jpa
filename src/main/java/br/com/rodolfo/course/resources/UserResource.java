package br.com.rodolfo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodolfo.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1, "maria", "maria@gmail.com", "11-99999-9999", "maria123");
		return ResponseEntity.ok().body(u);
	}
}
