package com.example.usuario.persistencia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 27/03/2018.
 */

class PersonasSingleton {

    private List<Persona> personas = new ArrayList<>();
    private static final PersonasSingleton ourInstance = new PersonasSingleton();

    static PersonasSingleton getInstance() {
        return ourInstance;
    }

    private PersonasSingleton() {
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
