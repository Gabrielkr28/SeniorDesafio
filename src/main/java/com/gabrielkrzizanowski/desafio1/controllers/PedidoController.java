package com.gabrielkrzizanowski.desafio1.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gabrielkrzizanowski.desafio1.entities.Pedido;
import com.gabrielkrzizanowski.desafio1.repositories.PedidoRepository;

@Controller
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido create(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public Pedido findById(UUID id) {
		return pedidoRepository.findById(id).orElse(null);
	}

	public Pedido update(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public void deleteById(UUID id) {
		pedidoRepository.deleteById(id);
	}

	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

}
