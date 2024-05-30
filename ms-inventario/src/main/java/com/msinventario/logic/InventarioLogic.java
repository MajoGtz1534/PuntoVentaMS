package com.msinventario.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msinventario.entity.Inventario;
import com.msinventario.repository.InventarioRepository;
import com.msinventario.request.InventarioRequest;
import com.msinventario.service.InventarioService;

@Service
public class InventarioLogic implements InventarioService{
	
	
	@Autowired
	InventarioRepository repo;
	
	RestTemplate http = new RestTemplate();
	@Override
	public Inventario guardar(InventarioRequest request) { 
		//Validacion si el producto existe
		//Consumir url de otro servicio
		
		Inventario inv = null;
		Integer id = http.getForObject("http://localhost:8085/productos/buscar-por-nombre/"+request.getNombre(), Integer.class);
		if (id!=null && id >0) {//Si el producto existe realiza el guardado
			inv = new Inventario();
			inv.setProductoid(id);
			inv.setInventarioid(request.getInventarioid());
			inv.setFecha(request.getFecha());
			inv.setStock(request.getStock());
			repo.save(inv); 

		}
		else { //Si no
			//Aqui se debera lanzar una excepcion
			
		}
		
		return inv; 
	}

	@Override
	public Inventario actualizar(InventarioRequest request) {
		Inventario inv = repo.findById(request.getInventarioid()).get(); 
				
		//inv.setProductoid(request.getProductoid());
		inv.setInventarioid(request.getInventarioid());
		inv.setFecha(request.getFecha());
		inv.setStock(request.getStock());
		repo.save(inv); 
				
		return inv; 
	}

	@Override
	public Inventario buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
