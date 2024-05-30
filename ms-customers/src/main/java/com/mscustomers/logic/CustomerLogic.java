package com.mscustomers.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mscustomers.entity.Customer;
import com.mscustomers.repository.CustomerRepository;
import com.mscustomers.request.CustomerRequest;
import com.mscustomers.service.CustomerService;

public class CustomerLogic implements CustomerService{

	
	@Autowired
	CustomerRepository repo;
	
	@Override
	public Customer guardar(CustomerRequest request) {
		
		Customer cliente = new Customer();
		cliente.setNombre(request.getNombre());
		cliente.setDomicilio(request.getDomicilio());
		cliente.setFechaNac(request.getFechaNac());
		
		repo.save(cliente);
		
		return null;
	}

	@Override
	public Customer actualizar(CustomerRequest request) {
		
		Customer cliente = repo.findById(request.getClienteId()).get();
		cliente.setNombre(request.getNombre());
		cliente.setDomicilio(request.getDomicilio());
		cliente.setFechaNac(request.getFechaNac());
		
		repo.save(cliente);
		
		return cliente;
	}

	@Override
	public Customer buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Se ha eliminado correctamente el registro"+id;
	}

	@Override
	public List mostrar() {
		// TODO Auto
		return repo.findAll();
	}

}
