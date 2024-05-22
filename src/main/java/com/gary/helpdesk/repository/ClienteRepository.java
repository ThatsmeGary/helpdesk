package com.gary.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gary.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
