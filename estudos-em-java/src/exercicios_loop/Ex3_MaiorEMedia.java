package exercicios_loop;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros;
        numeros = new double[5];
        int i = 0;
        double soma = 0;
        double maiorNumero = 0;

        do {
            System.out.println("Digite o " + (i+1) +" número: ");
            numeros [i] = scanner.nextDouble();
            soma += numeros[i];
            if (numeros[i]>maiorNumero){
                maiorNumero = numeros[i];
            }
            i++;
        } while (i<=4);

        System.out.println("O maior numero é: " + maiorNumero);
        System.out.println("A média é: " + (soma/5));

    }
}
