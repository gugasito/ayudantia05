public class Cafe {

    public enum Tamaño {
        Pequeño,
        Mediano,
        Grande
    }

    private int gramos;
    private float ml;
    private Tamaño tamaño;

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public float getMl() {
        return ml;
    }

    public void setMl(float ml) {
        this.ml = ml;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public Cafe(int gramos, float ml, Tamaño tamaño) {
        this.gramos = gramos;
        this.ml = ml;
        this.tamaño = tamaño;
    }

    public String toString() {
        return getGramos() + " gramos" + "|" + getMl() + " litros" + "|" + "Tamaño: " + getTamaño();
    }
}
