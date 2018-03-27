package com.example.usuario.persistencia;

/**
 * Created by Usuario on 27/03/2018.
 */

public class Persona {

    private String nombre;
    private String Apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (edad != persona.edad) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return Apellido != null ? Apellido.equals(persona.Apellido) : persona.Apellido == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (Apellido != null ? Apellido.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
