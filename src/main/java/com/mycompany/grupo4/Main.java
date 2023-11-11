
package com.mycompany.grupo4;

import helpers.Deportista;
import helpers.Doctor;
import helpers.Persona;


public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona = new Persona("Carlos", 65, "Puerto cortes, Elchile#2");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Dirección: " + persona.getDireccion());

        // Crear una instancia de la clase Doctor
        Doctor doctor = new Doctor("Omar", 35, "Pogreso", "Neurología");
        System.out.println("Nombre: " + doctor.getNombre());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Dirección: " + doctor.getDireccion());
        System.out.println("Especialidad: " + doctor.getEspecialidad());
        doctor.realizarDiagnostico();

        // Crear una instancia de la clase Deportista
        Deportista deportista = new Deportista("Luis", 20, "San Pedro Sula 789", "Fútbol");
        System.out.println("Nombre: " + deportista.getNombre());
        System.out.println("Edad: " + deportista.getEdad());
        System.out.println("Dirección: " + deportista.getDireccion());
        System.out.println("Deporte: " + deportista.getDeporte());
        deportista.corre();
    }
}
