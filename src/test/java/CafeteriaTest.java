import principal.Cafe;
import principal.Cafeteria;
import principal.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @Test
    void testAgregarCafe() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Cafe cafe1 = new Cafe(50, 50, Cafe.Tamaño.Grande,100);
        cafeteria1.agregarCafe(cafe1);
        assertEquals(1, cafeteria1.getListaCafes().size());
    }

    @Test
    void testEiminarCafe() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Cafe cafe1 = new Cafe(50, 50, Cafe.Tamaño.Grande,100);
        Cliente cliente1= new Cliente();
        cafeteria1.agregarCafe(cafe1);
        cafeteria1.comprarCafe(0,cliente1);
        assertEquals(0, cafeteria1.getListaCafes().size());
    }

    @Test
    void testBuscarcafe() {
        Cafeteria cafeteria1 = new Cafeteria("aaaa", "aaaaa", "aaaa");
        Cafe cafe1 = new Cafe(51, 99, Cafe.Tamaño.Grande,100);
        Cafe cafe2 = new Cafe(52, 57, Cafe.Tamaño.Grande,100);
        Cafe cafe3 = new Cafe(53, 75, Cafe.Tamaño.Grande,100);
        Cafe cafe4 = new Cafe(54, 50, Cafe.Tamaño.Grande,100);
        Cafe cafe5 = new Cafe(55, 100, Cafe.Tamaño.Grande,100);
        cafeteria1.agregarCafe(cafe1);
        cafeteria1.agregarCafe(cafe2);
        cafeteria1.agregarCafe(cafe3);
        cafeteria1.agregarCafe(cafe4);
        cafeteria1.agregarCafe(cafe5);
        assertEquals(5, cafeteria1.buscarCafe(Cafe.Tamaño.Grande));
    }
}