package com.olmo.arrayList.inicio;

public class Persona {

	private String nombre;
	private String apellido;
	private int tlf;
	private String ciudad;

	public Persona(String nombre, String apellido, int tlf, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tlf = tlf;
		this.ciudad = ciudad;
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

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", tlf=" + tlf + ", ciudad=" + ciudad + "]";
	}
}
