package datos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import principal.Cafe;
import principal.Producto;

import static org.junit.jupiter.api.Assertions.*;
import static principal.Main.crearCafe;
import static principal.Main.crearProducto;

class RegistroTest {
    @Test
    void registrarDato() {
        Cafe cafe1 = crearCafe(100, 250, Cafe.Tamaño.Mediano, 3);
        assertTrue(Registro.registrarDato(cafe1,"src/main/java/datos/datos.txt"));
        Producto oreo = crearProducto("Oreo", Producto.Categoria.Galletas, 1);
        assertTrue(Registro.registrarDato(oreo,"src/main/java/datos/datos.txt"));
    }
}