package com.company;

public class Persona {
    public  enum Genero {
        femenino,
        masculino,
        indeterminado
    }

    private  String Nombre;
    private   String Apellidos;
    private  String FechaNacimiento;
    private  String direccion;
    private String telefono;
    private Genero genero;
    private  String identificacion_leal;

    public Persona(String nombre, String apellidos, String fechaNacimiento, String direccion,
                   String telefono, Genero genero, String identificacion_leal) {
        Nombre = nombre;
        Apellidos = apellidos;
        FechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.identificacion_leal = identificacion_leal;
    }

    public Persona(String nombre, String apellidos, String fechaNacimiento, String direccion, Genero genero) {
        Nombre = nombre;
        Apellidos = apellidos;
        FechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getIdentificacion_leal() {
        return identificacion_leal;
    }

    public void setIdentificacion_leal(String identificacion_leal) {
        this.identificacion_leal = identificacion_leal;
    }
}
