package com.microservicios.microservicios.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.microservicios.microservicios.model.PersonaModel;
import com.microservicios.microservicios.service.PersonaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping()
    public ArrayList<PersonaModel> obtenerPersonas(){
        return personaService.obtenerPersonas();
    }

    @GetMapping( path = "/person/{id}")
    public Optional<PersonaModel> obtenerPersonaId(@PathVariable("id") Integer id) {
        return this.personaService.obtenerPersonaId(id);
    }
    
    @PostMapping(path = "/person")
    public PersonaModel guardarPersona(@RequestBody PersonaModel persona){
        return this.personaService.guardarPersona(persona);
    }

    @PutMapping(path= "/person/{id}")
	public PersonaModel updatePersonaId(@PathVariable("id") Integer id ,@RequestBody PersonaModel persona) {
		return this.personaService.updatePersonaId(persona);
	}

}
