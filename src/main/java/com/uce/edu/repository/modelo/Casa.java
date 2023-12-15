package com.uce.edu.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Casa {
	@Column(name = "casa_id")
	@Id
	@SequenceGenerator(name = "seq_casa", sequenceName = "seq_casa", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_casa")
	private Integer id;
	
	@Column(name = "casa_metros")
	private String metros;
	
	@Column(name = "casa_precio")
	private String precio;
	
	@Column(name = "casa_cuartos")
	private String cuartos;
	
	@Column(name = "casa_color")
	private String color;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMetros() {
		return metros;
	}
	public void setMetros(String metros) {
		this.metros = metros;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCuartos() {
		return cuartos;
	}
	public void setCuartos(String cuartos) {
		this.cuartos = cuartos;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Casa [id=" + id + ", metros=" + metros + ", precio=" + precio + ", cuartos=" + cuartos + ", color="
				+ color + "]";
	}

	
}
