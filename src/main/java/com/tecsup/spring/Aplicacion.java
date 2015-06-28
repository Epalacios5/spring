/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.spring;

import com.tecsup.spring.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author alumno
 */
public class Aplicacion {

    public static void main(String[] args) {
        //System.out.println("Tecsup - Hola");

        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");

        Aplicacion.ejemplo4(cntx);
    }
    
    public static void ejemplo5(ApplicationContext cntx) {

        Musico musico = (Musico) cntx.getBean("musicochuck");
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();
    }
    
    public static void ejemplo4(ApplicationContext cntx) {

        Musico musico = (Musico) cntx.getBean("musicochuck");
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();
    }
    
    public static void ejemplo3(ApplicationContext cntx) {

        Musico musico = (Musico) cntx.getBean("musicofelix");
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
