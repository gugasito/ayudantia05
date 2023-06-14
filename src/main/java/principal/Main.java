package principal;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria1 = crearCafeteria("Principal.Cafeteria el mormón", "calle 1234", "@cafeEM");
        Cafe cafe1 = crearCafe(100, 250, Cafe.Tamaño.Mediano, 3);
        Producto oreo = crearProducto("Oreo", Producto.Categoria.Galletas, 1);
        Trabajador trabajador1 = crearTrabajador(Trabajador.Tipo.Barista);
        Cliente cliente1 = crearCliente();
        cafeteria1.agregarCafe(cafe1);
        cafeteria1.agregarProducto(oreo);
        cafeteria1.agregarTrabajadores(trabajador1);
        cafeteria1.asociarCliente(cliente1);
        cafeteria1.comprarCafe(0,cliente1);
        System.out.println(cafeteria1.getListaClientes().get(0).getDinero());
        cafeteria1.comprarProducto(cliente1,0);
        System.out.println(cafeteria1.getListaClientes().get(0).getDinero());
        cafeteria1.mostrarVentas(cafeteria1);
    }

    public static Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Principal.Cliente creado con: " + cliente.getDinero() + " de saldo.");
        return cliente;
    }

    public static Cafeteria crearCafeteria(String nombre, String direccion, String rs) {
        Cafeteria cafeteria = new Cafeteria(nombre, direccion, rs);
        System.out.println("Principal.Cafeteria: " + cafeteria.getNombre() + " creada correctamente");
        return cafeteria;
    }

    public static Cafe crearCafe(int gramos, int ml, Cafe.Tamaño tamaño, float precio) {
        Cafe cafe = new Cafe(gramos, ml, tamaño, precio);
        System.out.println("Principal.Cafe: " + cafe + " creado correctamente");
        return cafe;
    }

    public static Trabajador crearTrabajador(Trabajador.Tipo tipo) {
        Trabajador trabajador = new Trabajador(tipo);
        System.out.println("Principal.Trabajador: " + trabajador.getTipo() + " registrado correctamente");
        return trabajador;
    }

    public static Producto crearProducto(String nombre, Producto.Categoria categoria, float precio) {
        Producto producto = new Producto(nombre, categoria, precio);
        System.out.println("Principal.Producto: " + producto.getNombre() + " creado correctamente");
        return producto;
    }
}
