package com.ajunior.webservicerest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajunior.webservicerest.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
