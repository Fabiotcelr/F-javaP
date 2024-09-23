package calculadora;

import operaciones.Operacion;
import operaciones.Suma;
import operaciones.Resta;
import operaciones.Multiplicacion;
import operaciones.Division;
import operaciones.Potencia;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("ingrese el primero numero para mostrar y operar");
            double num1 = scanner.nextDouble();

            System.out.println("ingrese el segundo numero para mostrar y operar");
            double num2 = scanner.nextDouble();

            FileWriter writer = new FileWriter("numeros.txt");
            writer.write(num1 + "\n" + num2);
            writer.close();

            File archivo = new File("numeros.txt");
            Scanner archivoScanner = new Scanner(archivo);

            double numArchivo1 = archivoScanner.nextDouble();
            double numArchivo2 = archivoScanner.nextDouble();

            System.out.println("Números que se guardaron en el archivo: " + numArchivo1 + ", " + numArchivo2);

            System.out.println("Selecciona la operación: 1. Suma 2. Resta 3. Multiplicación 4. División 5 Potenciación");

            int opcion = scanner.nextInt();

            Operacion operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new Suma(numArchivo1, numArchivo2);
                    break;
                case 2:
                    operacion = new Resta(numArchivo1, numArchivo2);
                    break;
                case 3:
                    operacion = new Multiplicacion(numArchivo1, numArchivo2);
                    break;
                case 4:
                    operacion = new Division(numArchivo1, numArchivo2);
                    break;
                case 5:
                    operacion = new Potencia(numArchivo1, numArchivo2);
                    break;
                default:
                    throw new InputMismatchException("Opción no válida. Debe ser un número entre 1 y 5.");
            }

            System.out.println("Resultado: " + operacion.calcular());
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo numeros.txt no existe en la ruta especificada.");
        } catch (IOException e) {
            System.out.println("Error al escribir o leer el archivo: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. ingrese un número.");
        } finally {
            scanner.close();
        }
    }
}
