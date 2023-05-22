import java.util.Random;

public class Cliente {
    private float dinero;

    public Cliente() {
        Random aleatorio = new Random(System.currentTimeMillis());
        this.dinero = aleatorio.nextInt(100);
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public void comprarProducto(Producto producto) {
        if (comprobarDinero(producto.getPrecio())) {
            setDinero(getDinero() - producto.getPrecio());
        }else{
            System.out.println("El cliente no cuenta con saldo suficiente para comprar este producto");
        }
    }


    public boolean comprobarDinero(float gasto) {
        return getDinero() - gasto > 0;
    }

    public void comprarCafe(Cafe cafe) {
        if (comprobarDinero(cafe.getPrecio())) {
            setDinero(getDinero() - cafe.getPrecio());
        }else{
            System.out.println("El cliente no cuenta con saldo suficiente para comprar este cafe");
        }
    }
}



