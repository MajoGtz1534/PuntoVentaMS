package com.msproductos.request;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Digits; 
import jakarta.validation.constraints.FutureOrPresent;
public class ProductoRequest {
	int productoId;
	int deptoid;
	@NotBlank(message="El nombre no puede quedar vacio")
	@Size(min=1,max=25, message="No debe estar vacio ni un mayor de 25 caracteres")
	String nombre;
	@FutureOrPresent(message="La fecha no puede estar en el pasado")
	LocalDate fechacad;
	@DecimalMax(value="999.99")
	String preciocompra;
	String precioventa;
	char refrigerado;
	
	public ProductoRequest() {
		
	}
	public ProductoRequest(int productoId, int deptoid, String nombre, LocalDate fechacad, String preciocompra,
			String precioventa, char refrigerado) {
		super();
		this.productoId = productoId;
		this.deptoid = deptoid;
		this.nombre = nombre;
		this.fechacad = fechacad;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.refrigerado = refrigerado;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public int getDeptoid() {
		return deptoid;
	}
	public void setDeptoid(int deptoid) {
		this.deptoid = deptoid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechacad() {
		return fechacad;
	}
	public void setFechacad(LocalDate fechacad) {
		this.fechacad = fechacad;
	}
	public String getPreciocompra() {
		return preciocompra;
	}
	public void setPreciocompra(String preciocompra) {
		this.preciocompra = preciocompra;
	}
	public String getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(String precioventa) {
		this.precioventa = precioventa;
	}
	public char getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}
	@Override
	public String toString() {
		return "ProductoRequest [productoId=" + productoId + ", deptoid=" + deptoid + ", nombre=" + nombre
				+ ", fechacad=" + fechacad + ", preciocompra=" + preciocompra + ", precioventa=" + precioventa
				+ ", refrigerado=" + refrigerado + "]";
	}
	
	

}
