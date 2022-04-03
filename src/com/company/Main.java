package com.company;

public class Main {

    public static void main(String[] args) {
    Persona manuelGarrido = new Persona("manuel","garrido","23/08/1968","calle elegancia",Persona.Genero.masculino);
        System.out.println("el nombre de esta persona es: " +manuelGarrido.getNombre());
        System.out.println("el nombre de esta persona es: " +manuelGarrido.getFechaNacimiento());

        manuelGarrido.setApellidos("marrero abreu");
        System.out.println("el apellido es: " +manuelGarrido.getApellidos());
        String []asignatura = {"bae", "pro", "ets", "lnd", "fol", "sistemas", "ingles"};
        Estudiante nicaciorPerera = new Estudiante("nicanor", "perera","10/10/2000", "calle busca",Persona.Genero.masculino, asignatura, "dam","tecnico");

        System.out.println("este estudiante es: " +nicaciorPerera.getNombre());
        System.out.println("este estudiante es: " +nicaciorPerera.printAsignatura());
    }
}
