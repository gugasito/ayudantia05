package principal;

public class Trabajador {
    private Tipo tipo;

    public enum Tipo {
        Barista,
        Mesero,
        Cocinero
    }

    public Trabajador(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
