package com.dawi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawi.models.Mensaje;

@Repository
public interface MensajeDao extends CrudRepository<Mensaje, Integer> {
	
	List<Mensaje> findByNomUsu(String nomUsu);
}
