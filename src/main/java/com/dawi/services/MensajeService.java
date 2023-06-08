package com.dawi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawi.models.Mensaje;
import com.dawi.repositories.IMensajeRepository;

@Service
public class MensajeService {

	@Autowired
	private IMensajeRepository repository;
	
	public Mensaje publicarMensaje(Mensaje msj) {
		return repository.save(msj);
	}
}
