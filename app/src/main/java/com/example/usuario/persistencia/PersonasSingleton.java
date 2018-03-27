package com.example.usuario.persistencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Usuario on 27/03/2018.
 */

class PersonasSingleton{

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

    public int size() {
        return personas.size();
    }

    public boolean contains(Object o) {
        return personas.contains(o);
    }

    public boolean add(Persona persona) {
        return personas.add(persona);
    }

    public boolean remove(Object o) {
        return personas.remove(o);
    }

    public Persona get(int i) {
        return personas.get(i);
    }
}
