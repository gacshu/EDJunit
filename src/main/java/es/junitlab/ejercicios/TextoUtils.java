package es.junitlab.ejercicios;

import java.util.Locale;
import java.util.Objects;

public class TextoUtils {

    public int contarVocales(String texto) {
        Objects.requireNonNull(texto, "El texto no puede ser null");

        int total = 0;
        for (char letra : texto.toLowerCase(Locale.ROOT).toCharArray()) {
            if ("aeiou".indexOf(letra) >= 0) {
                total++;
            }
        }
        return total;
    }

    public boolean esPalindromo(String texto) {
        Objects.requireNonNull(texto, "El texto no puede ser null");

        String limpio = texto
                .replaceAll("\\s+", "")
                .toLowerCase(Locale.ROOT);

        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }
}

