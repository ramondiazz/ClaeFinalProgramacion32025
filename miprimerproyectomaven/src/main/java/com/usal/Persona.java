package com.usal;


/**
 * 
 * Esta clase es muy importante
 * 
 * 
 * 
 */
public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * 
     * Esto es un metodo factory qu sirve para crear una persona a partir de un String separado por comas
     * 
     * @param personaString String separado por comas
     * @return retorna una Persona o lanza una @IllegalArgumentException si el String no es valido
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static Persona fromCSVString(String personaString){
        String [] trozos = personaString.split(",");
        if(trozos.length != 2){
            throw new IllegalArgumentException("Parametros invalidos");
        } else{
            return new Persona(personaString, personaString);
        }
    }
}
