/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josecastrillon.reto_1;

import java.time.LocalDate;

/**
 *
 * @author jocastrillon
 */
public class MainClass {

    public static void main(String[] args) {
        Persona persona = new Persona("35154541", "Pepito", "Perez", LocalDate.of(1983, 4, 8), 'M', "Ingeniero de Sistemas", "josecastrillon@gmail.com", EstadoCivilEnum.Separado, "311741581", "Via Neira", Escolaridad.Especialista);

        System.out.println("datos de la persona = " + persona.toString());

        System.out.println("persona Edad= " + persona.getEdad());

    }

}
