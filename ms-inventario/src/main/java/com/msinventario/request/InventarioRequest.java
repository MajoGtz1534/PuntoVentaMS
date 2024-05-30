package com.msinventario.request;

import java.time.LocalDate;

public class InventarioRequest {
	int inventarioid;
	String nombre;
	int stock;
	LocalDate fecha;
	
	public InventarioRequest() {
		
	}

	public InventarioRequest(int inventarioid, String nombre, int stock, LocalDate fecha) {
		super();
		this.inventarioid = inventarioid;
		this.nombre = nombre;
		this.stock = stock;
		this.fecha = fecha;
	}

	public int getInventarioid() {
		return inventarioid;
	}

	public void setInventarioid(int inventarioid) {
		this.inventarioid = inventarioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "InventarioRequest [inventarioid=" + inventarioid + ", nombre=" + nombre + ", stock=" + stock
				+ ", fecha=" + fecha + "]";
	}

	
	
}
