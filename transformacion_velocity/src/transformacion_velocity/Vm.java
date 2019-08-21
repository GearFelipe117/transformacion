/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacion_velocity;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.io.StringWriter;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 *
 * @author s205e12
 */
public class Vm {
    
    
    

    private VelocityEngine velocityEngine;
    private VelocityContext context;
    private org.apache.velocity.Template template;
    

    public Vm() {
        
        this.init();
    }
 
    public void init() {

        velocityEngine = new VelocityEngine();
        velocityEngine.init();
        template = velocityEngine.getTemplate("vm/hojadevida.vm"); // aqui la ruta relativa del bm dentro del src
        context = new VelocityContext();

    }

    public StringWriter transformar(Persona per) {

        context.put("name", per.getNombre());// es tipo clave valor y es la que debe aparecer en el vm ( $name)
        context.put("descripcion", per.getPerfil());
        context.put("foto",per.getFoto());
        
        StringWriter writer = new StringWriter();
        template.merge(context, writer);
        
        return writer;

    }
    
    
    

}
