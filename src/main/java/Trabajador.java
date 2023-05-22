import java.util.ArrayList;

public class Trabajador {
    private Tipo tipo;
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public enum Tipo {
        Barista,
        Mesero,
        Cocinero
    }

    public Trabajador(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        getClientes().add(cliente);
    }
}
