package com.msproductos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="PRODUCTOS")
public class Productos implements Serializable{
	public Productos() {
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Mapear la tabla de productos

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
		int productoId;
		
		@Column(name = "DEPTO_ID", columnDefinition ="NUMBER")
		int deptoid;

		@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(20)")
		String nombre;

		@Column(name = "FECHA_CAD", columnDefinition = "DATE")
		LocalDate fechacad;

		@Column(name = "PRECIO_COMPRA", columnDefinition = "NUMBER(5,2)")
		String preciocompra;

		@Column(name = "PRECIO_VENTA", columnDefinition = "NUMBER(5,2)")
		String precioventa;
		
		@Column(name = "REFRIGERADO", columnDefinition = "CHAR")
		char refrigerado;

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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
	
}
