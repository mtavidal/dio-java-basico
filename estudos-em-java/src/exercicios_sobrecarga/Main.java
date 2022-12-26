package exercicios_sobrecarga;
import static exercicios_sobrecarga.Area.calcularArea;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcularArea(3));
        System.out.println(calcularArea(5,2));
        System.out.println(calcularArea(7,4,6));
    }
}
