package com.gabrielkrzizanowski.desafio1.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID id;
	
	@Column(name = "valor", nullable = false)
	private Double valor;
	
	@Column(name = "valor_Desconto", nullable = true)
	private Double valorDesconto;
	
	@Column(nullable = false)
	@OneToMany(mappedBy = "pedido")
	@JsonBackReference
	private List<Item> itensPedidos = new ArrayList<>();
	
}
