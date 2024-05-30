package com.mscustomers.controller;

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

import com.mscustomers.entity.Customer;
import com.mscustomers.logic.CustomerLogic;
import com.mscustomers.request.CustomerRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("customers/")
public class CustomerController {
	@Autowired
	CustomerLogic service;
	
	
	@GetMapping
	public ResponseEntity<List<Customer>>mostrar(){
		List<Customer> clientes = service.mostrar();
		return new ResponseEntity<List<Customer>>(clientes,HttpStatus.OK); 
	}
	
	@PutMapping
	public ResponseEntity<Customer>actualizar(@Valid @RequestBody CustomerRequest request){
		Customer clientes = service.actualizar(request);
		return new ResponseEntity<Customer>(clientes,HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<Customer>guardar(@Valid @RequestBody CustomerRequest request){
		Customer clientes = service.guardar(request);
		return new ResponseEntity<Customer>(clientes,HttpStatus.OK); 
	}
	
	@DeleteMapping ("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String response = service.eliminar(id);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@GetMapping("bucar-por-id/{id}")
	public ResponseEntity<Customer> buscarPorId(@PathVariable int id){
		Customer cliente = service.buscar(id);
		return new ResponseEntity<Customer>(cliente, HttpStatus.OK);
	}
	
	
	//@GetMappin("buscar-por-rango-fechas/")
	//body rango de fechas
	//postman 1 solo json
	
	
	
	
}
