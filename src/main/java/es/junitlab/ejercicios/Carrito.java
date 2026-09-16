package es.junitlab.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private final List<Producto> productos = new ArrayList<>();

    public void agregar(String nombre, double precio) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        productos.add(new Producto(nombre, precio));
    }

    public int cantidad() {
        return productos.size();
    }

    public double total() {
        return productos.stream()
                .mapToDouble(Producto::precio)
                .sum();
    }

    public void vaciar() {
        productos.clear();
    }

    private record Producto(String nombre, double precio) {
    }
}

