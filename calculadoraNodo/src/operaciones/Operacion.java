package operaciones;

public abstract class Operacion {
    protected  double num1, num2;

    public  Operacion(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public abstract double calcular();
}
