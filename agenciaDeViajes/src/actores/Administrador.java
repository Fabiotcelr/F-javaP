package actores;

public class Administrador extends Usuario {
    private String rol;

    public Administrador() {
        super();
        this.rol = "Administrador";
    }

    public Administrador(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.rol = "Administrador";
    }
}
