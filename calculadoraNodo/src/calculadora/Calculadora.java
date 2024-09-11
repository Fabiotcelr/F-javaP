package calculadora;

import operaciones.Suma;
import operaciones.Resta;
import operaciones.Multiplicacion;
import operaciones.Division;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecciona la operación: 1. Suma 2. Resta 3. Multiplicación 4. División");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Suma suma = new Suma();
                System.out.println("Resultado: " + suma.operar(numero1, numero2));
                break;
            case 2:
                Resta resta = new Resta();
                System.out.println("Resultado: " + resta.operar(numero1, numero2));
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                System.out.println("Resultado: " + multiplicacion.operar(numero1, numero2));
                break;
            case 4:
                try {
                    Division division = new Division();
                    System.out.println("Resultado: " + division.operar(numero1, numero2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
