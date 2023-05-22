public class Producto {
    private String nombre;
    private Categoria categoria;
    private float precio;

    public enum Categoria{
        Lacteos,
        Galletas,
        Queques
    }

    public Producto(String nombre, Categoria categoria, float precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
