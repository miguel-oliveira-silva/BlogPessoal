package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;
@Entity
@Table(name = "tb_postagens")
public class Postagem {
	@Id //primary key	
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private Long id;
	
	@NotBlank(message = "Atributo titulo é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo titulo minimo 5 e maximo 100")
	@Column(length = 100)
	private String titulo;
	
	@NotBlank(message = "Atributo texto é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo texto minimo 10 e maximo 1000")
	@Column(length = 1000)
	private String texto;
	
	@UpdateTimestamp // Atualiza automaticamente a data e hora sempre que o registro for atualizado
	private LocalDateTime data;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}