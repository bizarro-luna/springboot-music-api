package com.luna.ejemplos.servicio.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luna.ejemplos.entidades.Album;
import com.luna.ejemplos.repositorio.AlbumRepositorio;
import com.luna.ejemplos.servicio.AlbumServicio;


@Service
public class AlbumServicioImpl implements AlbumServicio {

	@Autowired
	private AlbumRepositorio repositorio;
	
	
	@Override
	public List<Album> buscarTodos() {
		return repositorio.findAll();
	}


	@Override
	public void guardar(Album album) {
		repositorio.save(album);
	}
	
	
	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

}
