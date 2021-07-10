/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josecastrillon.reto_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author jocastrillon
 */
enum EstadoCivilEnum {
    Soltero, Casado, Union_Libre, Separado, Viudo
}

enum Escolaridad {
    Primaria, Secundaria, Tecnico, Tecnologo, Profesional, Especialista, Master, Doctor
}

public class Persona {

    private String documentoId;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private char genero; // M = Masculino, F = Femenino
    private String profesion;
    private String correoElectronico;
    private EstadoCivilEnum estadoCivil;
    private String numeroTelefono;
    private String direccion;
    private Escolaridad nivelEscolaridad;

    /**
     * *
     * Constructor.
     *
     * @param documentoId
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param genero
     * @param profesion
     * @param correoElectronico
     * @param estadoCivil
     * @param numeroTelefono
     * @param direccion
     * @param nivelEscolaridad
     */
    public Persona(String documentoId, String nombre, String apellidos, LocalDate fechaNacimiento, char genero, String profesion, String correoElectronico, EstadoCivilEnum estadoCivil, String numeroTelefono, String direccion, Escolaridad nivelEscolaridad) {
        this.documentoId = documentoId;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.profesion = profesion;
        this.correoElectronico = correoElectronico;
        this.estadoCivil = estadoCivil;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.nivelEscolaridad = nivelEscolaridad;
    }

    /**
     * **
     * Setter and Getters.
     */
    public String getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(String documentoId) {
        this.documentoId = documentoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public EstadoCivilEnum getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Escolaridad getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setNivelEscolaridad(Escolaridad nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    /**
     * *
     * Metodos de la clase.
     *
     * @param genero
     */
    public String getEdad() {

        Period edad = Period.between(getFechaNacimiento(), LocalDate.now());
        return (String.format("%d años, %d meses y %d días",edad.getYears(), edad.getMonths(),edad.getDays()));

    }

    @Override
    public String toString() {
        return "Persona{" + "documentoId=" + documentoId + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", profesion=" + profesion + ", correoElectronico=" + correoElectronico + ", estadoCivil=" + estadoCivil + ", numeroTelefono=" + numeroTelefono + ", direccion=" + direccion + ", nivelEscolaridad=" + nivelEscolaridad + '}';
    }

}
