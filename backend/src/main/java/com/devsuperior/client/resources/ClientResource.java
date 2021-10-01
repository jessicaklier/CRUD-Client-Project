package com.devsuperior.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
	List<Client> list = new ArrayList<>();
	list.add(new Client(1L, "Maria", null, null, null, null));
	list.add(new Client(2L, "Jessica", null, null, null, null));
	return ResponseEntity.ok().body(list);
		
	}
}
