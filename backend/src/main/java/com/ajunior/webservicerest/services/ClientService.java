package com.ajunior.webservicerest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajunior.webservicerest.entities.Client;
import com.ajunior.webservicerest.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
}
