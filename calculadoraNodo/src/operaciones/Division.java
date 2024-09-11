package operaciones;

public class Division {
    public double operar(double numero1, double numero2){
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1/numero2;
    }
}
