package com.msinventario.entity;

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
@Table(name ="INVENTARIO")
public class Inventario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	//Mapear la tabla de inventario

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "INVENTARIO_ID", columnDefinition = "NUMBER")
		int inventarioid;
		
		@Column(name = "PRODUCTO_ID", columnDefinition ="NUMBER")
		int productoid;

		@Column(name = "STOCK", columnDefinition = "NUMBER")
		int stock;

		@Column(name = "FECHA", columnDefinition = "DATE")
		LocalDate fecha;

		public int getInventarioid() {
			return inventarioid;
		}

		public void setInventarioid(int inventarioid) {
			this.inventarioid = inventarioid;
		}

		public int getProductoid() {
			return productoid;
		}

		public void setProductoid(int productoid) {
			this.productoid = productoid;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		

		
		

		

		
		
	
}
