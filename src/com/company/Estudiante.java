package com.company;

import java.util.Arrays;

public class Estudiante extends Persona{
    private String cial;
    private String [] asignaturas = new String[7];
    private String curso;
    private String titulacion;
    private  float [] calificaciones= new float[7];

    public Estudiante(String nombre, String apellidos, String fechaNacimiento, String direccion, String telefono, Genero genero,
                      String identificacion_leal, String cial, String[] asignaturas, String curso, String titulacion) {
        super(nombre, apellidos, fechaNacimiento, direccion, telefono, genero, identificacion_leal);
        this.cial = cial;
        this.asignaturas = asignaturas;
        this.curso = curso;
        this.titulacion = titulacion;
    }

    public Estudiante(String nombre, String apellidos, String fechaNacimiento, String direccion, Genero genero,
                      String[] asignaturas, String curso, String titulacion) {
        super(nombre, apellidos, fechaNacimiento, direccion, genero);
        this.asignaturas = asignaturas;
        this.curso = curso;
        this.titulacion = titulacion;
    }

    public String getCial() {
        return cial;
    }

    public void setCial(String cial) {
        this.cial = cial;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }

public String printAsignatura(){
  /*      String listaAsignatura= " ";
    for (int i = 0; i < this.asignaturas.length; i++) {
        if (i== 0){
            listaAsignatura = this.asignaturas[i];
        }else{
            listaAsignatura= listaAsignatura= ","+ this.asignaturas[i];
        }

    }
    return  listaAsignatura;*/
    return Arrays.toString(this.asignaturas);
}
}
