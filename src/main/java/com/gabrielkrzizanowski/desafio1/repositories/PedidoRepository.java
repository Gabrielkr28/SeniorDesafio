package com.gabrielkrzizanowski.desafio1.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielkrzizanowski.desafio1.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

	
}
