import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @Test
    void testAgregarCafe() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Cafe cafe1 = new Cafe(50, 50, Cafe.Tamaño.Grande);
        cafeteria1.agregarCafe(cafe1);
        assertEquals(1, cafeteria1.getListaCafes().size());
    }

    @Test
    void testEiminarCafe() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Cafe cafe1 = new Cafe(50, 50, Cafe.Tamaño.Grande);
        cafeteria1.agregarCafe(cafe1);
        cafeteria1.eliminarCafe(0);
        assertEquals(0, cafeteria1.getListaCafes().size());
    }

    @Test
    void testBuscarcafe() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Cafe cafe1 = new Cafe(51, 99, Cafe.Tamaño.Grande);
        Cafe cafe2 = new Cafe(52, 57, Cafe.Tamaño.Grande);
        Cafe cafe3 = new Cafe(53, 75, Cafe.Tamaño.Grande);
        Cafe cafe4 = new Cafe(54, 50, Cafe.Tamaño.Grande);
        Cafe cafe5 = new Cafe(55, 100, Cafe.Tamaño.Grande);
        cafeteria1.agregarCafe(cafe1);
        cafeteria1.agregarCafe(cafe2);
        cafeteria1.agregarCafe(cafe3);
        cafeteria1.agregarCafe(cafe4);
        cafeteria1.agregarCafe(cafe5);
        assertEquals(5, cafeteria1.buscarCafe(Cafe.Tamaño.Grande));
    }

    @Test
    void agregarDona() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Rosquilla dona1 = new Rosquilla(Rosquilla.Sabor.Anis, Rosquilla.Tamaño.Grande, Rosquilla.Glaseado.Lisas);
        cafeteria1.agregarDona(dona1);
        assertEquals(1, cafeteria1.getListaDonas().size());
    }

    @Test
    void eliminarDona() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Rosquilla dona1 = new Rosquilla(Rosquilla.Sabor.Anis, Rosquilla.Tamaño.Grande, Rosquilla.Glaseado.Lisas);
        cafeteria1.agregarDona(dona1);
        cafeteria1.eliminarDona(0);
        assertEquals(0, cafeteria1.getListaDonas().size());
    }
}