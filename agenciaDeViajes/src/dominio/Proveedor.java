package dominio;

public class Proveedor {
    private int id;
    private String nombrePlataforma;

    public Proveedor(int id, String nombrePlataforma) {
        this.id = id;
        this.nombrePlataforma = nombrePlataforma;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombrePlataforma() { return nombrePlataforma; }
    public void setNombrePlataforma(String nombrePlataforma) { this.nombrePlataforma = nombrePlataforma; }
}
