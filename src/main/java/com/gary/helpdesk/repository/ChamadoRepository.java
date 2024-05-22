package com.gary.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gary.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
