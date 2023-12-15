package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Auto {
	@Column(name = "auto_id")
	@Id
	@SequenceGenerator(name = "seq_auto", sequenceName = "seq_auto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_auto")
	private Integer id;

	@Column(name = "auto_marca")
	private String marca;

	@Column(name = "auto_placa")
	private String placa;

	@Column(name = "auto_nombre_dueño")
	private String nombreDueño;

	@Column(name = "auto_trasmicion")
	private String trasmicion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

	public String getTrasmicion() {
		return trasmicion;
	}

	public void setTrasmicion(String trasmicion) {
		this.trasmicion = trasmicion;
	}

}
