package exercicios_sobrecarga;

public class Area {

    public static double calcularArea (double lado){
        double area = lado*lado;
        return area;
    }

    public static double calcularArea (double base, double altura){
        double area = base*altura;
        return area;
    }

    public static double calcularArea (double baseMaior, double baseMenor, double altura){
        double area = (baseMaior+baseMenor)*altura/2;
        return area;
    }

}
