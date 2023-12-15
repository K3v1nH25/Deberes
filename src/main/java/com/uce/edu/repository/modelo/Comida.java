package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Comida {
	@Column(name = "comi_id")
	@Id
	@SequenceGenerator(name = "seq_comi", sequenceName = "seq_comi", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comi")
	private Integer id;

	@Column(name = "comi_platillo")
	private String platillo;

	@Column(name = "comi_precio")
	private String precio;

	@Column(name = "comi_ingredientes")
	private String ingredinetes;

	@Column(name = ("comi_estado"))
	private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlatillo() {
		return platillo;
	}

	public void setPlatillo(String platillo) {
		this.platillo = platillo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getIngredinetes() {
		return ingredinetes;
	}

	public void setIngredinetes(String ingredinetes) {
		this.ingredinetes = ingredinetes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
