package es.junitlab.ejercicios;

public class NumeroUtils {

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public int mayorDeTres(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

