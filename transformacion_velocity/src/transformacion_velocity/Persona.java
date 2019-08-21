/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacion_velocity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s205e12
 */
public class Persona {
    
    private String nombre;
    private String perfil;
    private List <Estudio>estudios;
    private String foto;

    public Persona(String nombre, String perfil, String foto) {
        this.nombre = nombre;
        this.perfil = perfil;
        this.foto = foto;
        this.estudios = new ArrayList();
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

 
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(List<Estudio> estudios) {
        this.estudios = estudios;
    }
    

}
