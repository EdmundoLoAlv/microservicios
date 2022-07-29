package com.microservicios.microservicios.service;

import java.util.ArrayList;
import java.util.Optional;

import com.microservicios.microservicios.model.PersonaModel;
import com.microservicios.microservicios.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public ArrayList<PersonaModel> obtenerPersonas(){
        return (ArrayList<PersonaModel>) personaRepository.findAll();
    }

    public Optional<PersonaModel> obtenerPersonaId(int id){
        return personaRepository.findById(id);
    }

    public PersonaModel guardarPersona(PersonaModel persona){
        return personaRepository.save(persona);
    }

    public PersonaModel updatePersonaId(PersonaModel persona ){
        return personaRepository.save(persona);
    }
    
}
