package com.luna.ejemplos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luna.ejemplos.entidades.Album;



public interface AlbumRepositorio extends JpaRepository<Album, Integer> {

}
