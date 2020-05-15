package com.uca.capas.labo5.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.labo5.domain.Estudiante;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Estudiante> getAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("Select * from public.estudiante");
		Query query = entityManager.createNativeQuery(sb.toString(), Estudiante.class);
		List<Estudiante> resulset = query.getResultList();
		
		return resulset;
	}

	@Override
	@Transactional
	public void create(Estudiante e) throws DataAccessException {
		entityManager.persist(e);
	}  

}
