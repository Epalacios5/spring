package com.tecsup.spring;

import com.tecsup.spring.model.Instrumento;
import com.tecsup.spring.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {
    
    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
        Aplicacion.ejemplo7(cntx);
    }
    
    public static void ejemplo7(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("charly");

        for (Instrumento in : musico.getInstrumentos()) {
            in.sonido();
        }
    }
    
    public static void ejemplo6(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("kurt");
        musico.getInstrumento().sonido();
    }
    
    public static void ejemplo5(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("donald");
        System.out.println(musico.getNombre());
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();
    }
    
    public static void ejemplo4(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("chuck");
        //System.out.println(musico.getCanciones());
          System.out.println(musico.getNombre());    
    }
    
    public static void ejemplo3(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("felix");
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();
    }
    
    public static void ejemplo2(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("bob");
        musico.who();
        System.out.println(musico.getCanciones());
    }
    
    public static void ejemplo1(ApplicationContext cntx) {
        Musico musico = (Musico) cntx.getBean("musico");
        musico.who();
    }
}
