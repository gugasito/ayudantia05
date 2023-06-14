package principal;

import datos.Registro;

import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private String rs;
    private ArrayList<Cafe> listaCafes = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cafe> getListaCafes() {
        return listaCafes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Cafeteria(String nombre, String direccion, String rs) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rs = rs;
    }

    public void agregarCafe(Cafe newCafe) {
        getListaCafes().add(newCafe);
    }

    public void comprarCafe(int posi, Cliente cliente) {
        Registro.registrarDato(getListaCafes().get(posi),"src/main/java/datos/datos.txt");
        cliente.comprarCafe(getListaCafes().get(posi));
        this.getListaCafes().remove(posi);
    }

    public int buscarCafe(Cafe.Tamaño tamaño) {
        int posi = 0;
        int contador = 0;
        for (int i = 0; i < getListaCafes().size(); i++) {
            if (getListaCafes().get(i).getTamaño().equals(tamaño)) {
                posi = i;
                contador++;
                System.out.println("Principal.Cafe " + tamaño + " en la posicion: " + posi);
            }
        }
        return contador;
    }

    public void agregarProducto(Producto producto) {
        getListaProductos().add(producto);
    }

    public void agregarTrabajadores(Trabajador trabajador) {
        getListaTrabajadores().add(trabajador);
    }

    public void asociarCliente(Cliente cliente) {
        getListaClientes().add(cliente);
    }

    public void comprarProducto(Cliente cliente, int posi) {
        Registro.registrarDato(getListaProductos().get(posi),"src/main/java/datos/datos.txt");
        cliente.comprarProducto(getListaProductos().get(posi));
        this.getListaProductos().remove(posi);
    }

    public void mostrarVentas(Cafeteria cafeteria) {
        Registro.leerVentas(cafeteria, "src/main/java/datos/datos.txt");
    }
}

