package com.gabrielkrzizanowski.desafio1.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gabrielkrzizanowski.desafio1.enums.TipoItens;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID id;
	
	@Column(name = "tipo")
	private TipoItens tipo;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable =  false)
	private Double valor;

	@JoinColumn(name = "pedido_id", nullable = false)
	@ManyToOne
	@JsonManagedReference
	private Pedido pedido;
}
