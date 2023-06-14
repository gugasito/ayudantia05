package principal;

public class Cafe {

    public enum Tamaño {
        Pequeño,
        Mediano,
        Grande
    }

    private int gramos;
    private float ml;
    private Tamaño tamaño;
    private float precio;

    public int getGramos() {
        return gramos;
    }

    public float getMl() {
        return ml;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public Cafe(int gramos, float ml, Tamaño tamaño, float precio) {
        this.gramos = gramos;
        this.ml = ml;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String toString() {
        return "Cafe: [" + getGramos() + " gramos" + ", " + getMl() + " litros" + ", " + getTamaño() + ", " + getPrecio()+"]";
    }
}
