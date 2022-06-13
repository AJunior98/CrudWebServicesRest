package com.ajunior.webservicerest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajunior.webservicerest.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Junior","47151523807",1300.00,"1998-09-29T08:00:00Z",2));
		list.add(new Client(2L, "Joao","55566688877",2600.00,"2007-04-15T08:00:00Z",2));
		return ResponseEntity.ok().body(list);
	}
	
}
