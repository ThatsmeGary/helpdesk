package com.gary.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gary.helpdesk.domain.Chamado;
import com.gary.helpdesk.domain.Cliente;
import com.gary.helpdesk.domain.Tecnico;
import com.gary.helpdesk.domain.enums.Perfil;
import com.gary.helpdesk.domain.enums.Prioridade;
import com.gary.helpdesk.domain.enums.Status;
import com.gary.helpdesk.repository.ChamadoRepository;
import com.gary.helpdesk.repository.ClienteRepository;
import com.gary.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {

    @Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

    public void intanciaDB(){
        Tecnico t1 = new Tecnico(null, "Gabriel Souza", "02438161035", "gabriel@gmail.com", "1234");
		t1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "84871148062", "linus@pussy.com", "linusbitch");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", t1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
