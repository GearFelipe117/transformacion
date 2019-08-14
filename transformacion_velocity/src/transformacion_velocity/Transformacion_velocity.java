/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacion_velocity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author s205e12
 */
public class Transformacion_velocity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Persona per = new Persona("felipe","hola","result\\imagen\\brad.png");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d = new Date();

        per.getEstudios().add(new Estudio ("UDEM","Ingenieria en Telecomunicaciones",d)); // cuidado por el new estudiantes
        
        
        Vm vel = new Vm(per);
        
    }
    
}
