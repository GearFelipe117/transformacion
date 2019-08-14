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
    
    private Persona per;

    public Vm(Persona per) {
        this.per = per;
    }
    
    public void transformar(Persona per){
    
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        org.apache.velocity.Template t = velocityEngine.getTemplate("index.vm");

        VelocityContext context = new VelocityContext();
        context.put("name", "World");

        StringWriter writer = new StringWriter();
        t.merge(context, writer);

    }
    
    
}
