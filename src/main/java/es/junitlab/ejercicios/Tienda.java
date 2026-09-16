package es.junitlab.ejercicios;

public class Tienda {

    public double aplicarDescuento(double precio, double porcentaje) {
        if (precio < 0 || porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException(
                    "El precio y el porcentaje deben estar en un rango válido");
        }

        return precio * (1 - porcentaje / 100);
    }
}

