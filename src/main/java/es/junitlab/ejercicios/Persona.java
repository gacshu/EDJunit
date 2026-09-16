package es.junitlab.ejercicios;

public class Persona {

    public String clasificarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad < 12) {
            return "INFANCIA";
        }
        if (edad < 18) {
            return "ADOLESCENCIA";
        }
        return "ADULTEZ";
    }
}

