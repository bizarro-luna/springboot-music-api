package com.luna.ejemplos.cotrolador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luna.ejemplos.entidades.Album;
import com.luna.ejemplos.servicio.AlbumServicio;

@RestController
@RequestMapping("/api")
public class AlbumControlador {
	
	
	@Autowired
	private AlbumServicio servicio;
	
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return servicio.buscarTodos();
	}
	
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		
		servicio.guardar(album);
		return album;
	}
	
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		servicio.guardar(album);
		return album;
	}
	
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") Integer id ) {
		servicio.eliminar(id);
		return "Registro eliminado";
	}
	
	

}
