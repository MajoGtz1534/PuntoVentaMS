package com.mscustomers.request;

import java.time.LocalDate;

public class CustomerRequest {
	int clienteId;
	String nombre;
	LocalDate fechaNac;
	String domicilio;

	public CustomerRequest() {

	}

	public CustomerRequest(int clienteId, String nombre, LocalDate fechaNac, String domicilio) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.domicilio = domicilio;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "CustomerRequest [clienteId=" + clienteId + ", nombre=" + nombre + ", fechaNac=" + fechaNac
				+ ", domicilio=" + domicilio + "]";
	}

}
