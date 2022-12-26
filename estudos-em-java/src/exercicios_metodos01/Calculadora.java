package exercicios_metodos01;

public class Calculadora {

    public static void calcularSoma(double num1, double num2){
        double soma = num1 + num2;
        System.out.println("O valor da soma de " +num1+ " e " +num2+ " é: " +soma);
    }

    public static void calcularSubtracao(double num1, double num2){
        double subtracao = num1 - num2;
        System.out.println("O valor da subtração de " +num1 +" e " +num2+ " é: " +subtracao);
    }

    public static void calcularMultiplicacao(double num1, double num2){
        double multiplicacao = num1 * num2;
        System.out.println("O valor da multiplicação de " +num1+ " e " +num2+ " é: " +multiplicacao);
    }

    public static void calcularDivisao(double num1, double num2){
        double divisao = num1 / num2;
        System.out.println("O valor da divisão de " +num1+ " e " +num2+ " é: " +divisao);
    }



}
