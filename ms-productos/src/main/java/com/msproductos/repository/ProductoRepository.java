package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;


@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer>{
	
	//Consultas personalizadas, cuando sean necesario
		
	//Con la anotacion @Query podemos crear consultas personalizadas,hechas en Jpql(Pseudolenguaje de consultas) investigar
		@Query("SELECT p.productoId FROM Productos p WHERE p.nombre=:nombre")
		Integer findByName(@Param("nombre")String nombre);
		//@Param un argumento
		
	
}
