package actores;

public class GestorViajes extends Usuario {
    private String rol;

    public GestorViajes() {
        super();
        this.rol = "Gestor de Viajes";
    }

    public GestorViajes(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.rol = "Gestor de Viajes";
    }
}
