package com.microservicios.microservicios.repositories;

import com.microservicios.microservicios.model.PersonaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Integer>{
    
}
