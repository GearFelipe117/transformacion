/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacion_velocity;


import java.util.Date;

/**
 *
 * @author s205e12
 */
public class Estudio {
    private String universidad;
    private String titulo;
    private Date fecha;

    public Estudio(String universidad, String titulo, Date fecha) {
        this.universidad = universidad;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
