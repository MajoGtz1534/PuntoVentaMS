package com.msproductos.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;

@Service
public class ProductoLogic implements ProductoService{

	
	//Inyeccion de dependencias
	@Autowired
	ProductoRepository repo;
	
	
	@Override
	public Productos guardar(ProductoRequest request) {
		
		//if((request.getRefrigerado()=='N') == false) {
			//Restrinccion, o un error! no continuar
		//}
		
		//Entonces si, guardame todo
		
		Productos prod = new Productos(); //Objeto nuevo
		
		if(!(request.getRefrigerado()=='Y' || request.getRefrigerado()=='N') ){
			
		}
		else {
		//Productos prod = new Productos(); //Objeto nuevo
		
		prod.setDeptoid(request.getDeptoid());
		prod.setNombre(request.getNombre());
		prod.setFechacad(request.getFechacad());
		prod.setPrecioventa(request.getPrecioventa());
		prod.setPreciocompra(request.getPreciocompra());
		prod.setRefrigerado(request.getRefrigerado());
		
		repo.save(prod); //Llamo al objeto del repository para invocar la funcion guardar
		
		//return prod; //retorno el objeto con un id dad por el repository
		}
		
		return prod;
		
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		
		
		//Buscamos el registro existente prod devuelve un opcional y atraemos el objeto con get
		Productos prod = repo.findById(request.getProductoId()).get();
		
		if(prod != null) {
			
			prod.setDeptoid(request.getDeptoid());
			prod.setNombre(request.getNombre());
			prod.setFechacad(request.getFechacad());
			prod.setPrecioventa(request.getPrecioventa());
			prod.setPreciocompra(request.getPreciocompra());
			prod.setRefrigerado(request.getRefrigerado());
			
			repo.save(prod); //Llamo al objeto del repository para invocar la funcion guardar
			
		}

		return prod; //retorno el objeto con un id dad por el repository
	}

	@Override
	public Productos buscar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	//Metodo va a recibir el nombre del producto a buscar
	public Integer buscarProducto(String nombre) {
		return repo.findByName(nombre);
	}

}
