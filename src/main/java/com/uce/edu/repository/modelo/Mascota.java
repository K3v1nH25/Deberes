package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Mascota {
	@Column(name = "masc_id")
	@Id
	@SequenceGenerator(name = "seq_masc", sequenceName = "seq_masc", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_masc")
	private Integer id;

	@Column(name = "masc_nombre")
	private String nombre;

	@Column(name = "masc_apodo")
	private String apodo;

	@Column(name = "masc_edad")
	private String edad;

	@Column(name = "masc_comida_favorita")
	private String comidaFavorita;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}

}
