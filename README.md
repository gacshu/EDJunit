# JUnit Lab · Proyecto Java versión 2

Esta versión contiene únicamente el código Java de los ejercicios y del ejemplo de carrito. No incluye `src/test` ni dependencias de JUnit: está preparada para que añadas o apliques tus propios tests.

## Código incluido

```text
src/main/java/es/junitlab/ejercicios/
├── NumeroUtils.java   # Retos 1 y 2: esPar y mayorDeTres
├── TextoUtils.java    # Retos 3 y 5: contarVocales y esPalindromo
├── Tienda.java        # Reto 4: aplicarDescuento
├── Persona.java       # Reto 6: clasificarEdad
└── Carrito.java       # Ejemplo para @BeforeAll, @BeforeEach y @AfterEach
```

## Abrir y compilar

Abre esta carpeta como proyecto Maven en IntelliJ IDEA, Eclipse o NetBeans. Para compilar el código de producción:

```bash
mvn compile
```

Después puedes crear tus clases de test en `src/test/java/es/junitlab/ejercicios/` y añadir JUnit 5 al `pom.xml`, siguiendo los ejemplos de la guía web o de la versión completa del proyecto.

## Métodos disponibles

- `NumeroUtils.esPar(int)`
- `NumeroUtils.mayorDeTres(int, int, int)`
- `TextoUtils.contarVocales(String)`
- `TextoUtils.esPalindromo(String)`
- `Tienda.aplicarDescuento(double, double)`
- `Persona.clasificarEdad(int)`
- `Carrito.agregar(String, double)`, `cantidad()`, `total()` y `vaciar()`

