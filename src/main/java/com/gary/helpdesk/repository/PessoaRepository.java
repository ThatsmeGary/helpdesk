package com.gary.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gary.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
