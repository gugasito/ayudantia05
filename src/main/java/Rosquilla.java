public class Rosquilla {
    public enum Sabor {
        Anis,
        Limon,
        Naranja
    }

    public enum Tamaño {
        Grande,
        Mediana
    }

    public enum Glaseado {
        Francesas,
        Lisas,
        Tontas,
        SantaClara
    }

    private Sabor sabor;
    private Tamaño tamaño;

    private Glaseado glaseado;

    public Rosquilla(Sabor sabor, Tamaño tamaño, Glaseado glaseado) {
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.glaseado = glaseado;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public Glaseado getGlaseado() {
        return glaseado;
    }

    public void setGlaseado(Glaseado glaseado) {
        this.glaseado = glaseado;
    }


    public String toString() {
        return "Sabor:" + getSabor() + " | " + "Glaseado:" + getGlaseado() + " | " + "Tamaño:" + getTamaño();
    }
}
