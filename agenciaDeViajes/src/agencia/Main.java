package agencia;

import actores.Cliente;
import actores.Administrador;
import actores.GestorViajes;

public class Main {
    public static void main(String[] args) {
        // Instanciar clases
        Cliente cliente = new Cliente(1, "Juan", "Pérez", "1990-01-01", "Calle 123", "123456789");
        Administrador admin = new Administrador(2, "Ana", "Gómez", "1985-05-15", "Calle 456", "987654321");
        GestorViajes gestor = new GestorViajes(3, "Luis", "Martínez", "1992-09-20", "Calle 789", "555555555");

        // Agregar destino al cliente
        cliente.agregarDestino("Cancún");

        // Imprimir información
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Destinos: " + cliente.getDestinos());
    }
}
