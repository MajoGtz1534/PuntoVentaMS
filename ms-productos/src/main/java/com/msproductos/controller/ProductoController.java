package com.msproductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproductos.entity.Productos;
import com.msproductos.logic.ProductoLogic;
import com.msproductos.request.ProductoRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("productos/")
public class ProductoController {
	//http://localhost:8095/productos
	@Autowired
	ProductoLogic service;
	@GetMapping
	public ResponseEntity<List<Productos>>mostrar(){
		List<Productos> productos = service.mostrar();
		return new ResponseEntity<List<Productos>>(productos,HttpStatus.OK);

	}
	
	//http://localhost:8095/productos/guardar
	@PostMapping
	public ResponseEntity<Productos> guardar(@Valid @RequestBody ProductoRequest request){
		Productos producto = service.guardar(request);
		return new ResponseEntity<Productos>(producto,HttpStatus.OK);
	}
	
	//http://localhost:8095/productos/actualizar
	@PutMapping
	public ResponseEntity<Productos> actualizar(@Valid @RequestBody ProductoRequest request){
		Productos producto = service.actualizar(request);
		return new ResponseEntity<Productos>(producto,HttpStatus.OK);
		
	}
	
	//http://localhost:8095/productos/buscar/1
	@GetMapping("buscar/{id}")
	public ResponseEntity<Productos> buscar(@PathVariable int id){
		Productos producto = service.buscar(id);
		return new ResponseEntity<Productos>(producto,HttpStatus.OK);
	}
	
	//http://localhost:8095/productos/eliminar/1
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String response = service.eliminar(id);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-nombre/{nombre}")
	public ResponseEntity<Integer> buscarPorNombre(@PathVariable String nombre){
		Integer id = service.buscarProducto(nombre);
		return new ResponseEntity<Integer>(id,HttpStatus.OK);
	}
	
	
	
}
