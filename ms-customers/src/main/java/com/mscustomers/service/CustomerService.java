package com.mscustomers.service;

import java.util.List;

import com.mscustomers.entity.Customer;
import com.mscustomers.request.CustomerRequest;


public interface CustomerService {
	Customer guardar(CustomerRequest request);
	Customer actualizar(CustomerRequest request);
	Customer buscar(int id);
	String eliminar(int id);
	List mostrar();
	
}
