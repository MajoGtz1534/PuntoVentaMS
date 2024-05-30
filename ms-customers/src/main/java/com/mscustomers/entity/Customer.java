package com.mscustomers.entity;

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
@Table(name ="CUSTOMERS")
public class Customer implements Serializable{
	public Customer() {
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Mapear la tabla de productos

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
		int clienteId;
		
		@Column(name = "NOMBRE", columnDefinition ="NVARCHAR2(15)")
		String nombre;

		@Column(name = "FECHA_NAC", columnDefinition = "DATE")
		LocalDate fechaNac;

		@Column(name = "DOMICILIO", columnDefinition = "NVARCHAR2(40)")
		String domicilio;

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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		
		
		
		
	
}
