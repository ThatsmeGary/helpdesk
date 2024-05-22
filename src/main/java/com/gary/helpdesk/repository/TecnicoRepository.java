package com.gary.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gary.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
