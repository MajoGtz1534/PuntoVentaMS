package com.msinventario.service;

import java.util.List;

import com.msinventario.entity.Inventario;
import com.msinventario.request.InventarioRequest;


public interface InventarioService {
	
	Inventario guardar(InventarioRequest request);
	Inventario actualizar(InventarioRequest request);
	Inventario buscar(int id);
	String eliminar(int id);
	List mostrar();
}
