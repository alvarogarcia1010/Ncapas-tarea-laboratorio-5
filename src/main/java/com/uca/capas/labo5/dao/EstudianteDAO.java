package com.uca.capas.labo5.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.labo5.domain.Estudiante;

public interface EstudianteDAO {
	public List<Estudiante> getAll() throws DataAccessException;
	
	public void create(Estudiante e) throws DataAccessException;
	
	public void delete(Integer codigoEstudiante) throws DataAccessException;

}
