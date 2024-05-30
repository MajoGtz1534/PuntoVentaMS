package com.msinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msinventario.entity.Inventario;


@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Integer>{
	
	//Consultas personalizadas, cuando sean necesario
	
}