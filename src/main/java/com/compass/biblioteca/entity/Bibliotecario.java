package com.compass.biblioteca.entity;




import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

// nao da os construtores
@Entity @Data
public class Bibliotecario {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	
	private String senha;
	
	
	

}
