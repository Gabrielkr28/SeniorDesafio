package com.gabrielkrzizanowski.desafio1.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielkrzizanowski.desafio1.entities.Item;

@Repository
public interface ItemPedidoRepository extends JpaRepository<Item, UUID> {

}
