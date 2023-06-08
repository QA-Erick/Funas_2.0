package com.dawi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dawi.models.Mensaje;

@Repository
public interface IMensajeRepository extends JpaRepository<Mensaje, Integer> {
	
	List<Mensaje> findByNomUsu(String nomUsu);
}
