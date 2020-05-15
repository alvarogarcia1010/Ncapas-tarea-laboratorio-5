package com.uca.capas.labo5.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {

	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name="nombre")
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Column(name="apellido")
	@NotEmpty(message="Este campo no puede estar vacio")
	private String apellido;
	
	@Column(name="carne")
	@NotEmpty(message="Este campo no puede estar vacio")
	@Size(min=8, max=8, message="El carnet debe tener 8 digitos")
	private String carnet;
	
	@Column(name="carrera")
	@NotEmpty(message="Este campo no puede estar vacio")
	private String carrera;
	
	public Estudiante() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
}
