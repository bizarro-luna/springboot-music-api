package com.luna.ejemplos.servicio;

import java.util.List;

import com.luna.ejemplos.entidades.Album;

public interface AlbumServicio {
	
	List<Album> buscarTodos();
	
	void guardar(Album album);
	
	void eliminar(Integer id);
	

}
