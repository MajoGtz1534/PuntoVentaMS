package com.msinventario.controller;

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

import com.msinventario.entity.Inventario;
import com.msinventario.logic.InventarioLogic;
import com.msinventario.request.InventarioRequest;


@RestController
@RequestMapping("inventario/")
public class InventarioController {
	@Autowired
	InventarioLogic service;
	@GetMapping
	public ResponseEntity<List<Inventario>>mostrar(){
		List<Inventario> inv = service.mostrar();
		return new ResponseEntity<List<Inventario>>(inv,HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<Inventario> guardar(@RequestBody InventarioRequest request){
		Inventario inv = service.guardar(request);
		return new ResponseEntity<Inventario>(inv,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Inventario> actualizar(@RequestBody InventarioRequest request){
		Inventario inv = service.actualizar(request);
		return new ResponseEntity<Inventario>(inv,HttpStatus.OK);		
	}
	
	@GetMapping("buscar/{id}")
	public ResponseEntity<Inventario> buscar(@PathVariable int id){
		Inventario inv = service.buscar(id);
		return new ResponseEntity<Inventario>(inv,HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String response = service.eliminar(id);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	
}
