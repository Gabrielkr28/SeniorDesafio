package com.gabrielkrzizanowski.desafio1.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielkrzizanowski.desafio1.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	//Realiza a aplicação do percentual do desconto com base nas regras estabelecidas.
	public void percentualDescontoPedido(UUID id, Double percentual) {
		
	}
	
}
