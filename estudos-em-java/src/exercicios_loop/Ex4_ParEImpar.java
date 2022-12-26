package exercicios_loop;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeroPar = 0;
        int numeroImpar = 0;
        int i = 0;

        System.out.println("Quantos números você vai digitar: ");
        int qntNumeros = scanner.nextInt();

        do {
            System.out.println("Digite o " + (i + 1) + " número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
            i++;
        } while (i < qntNumeros);

        System.out.println("Foram digitados " + qntNumeros + " números e " + numeroPar + " são pares.");
        System.out.println("Foram digitados " + qntNumeros + " números e " + numeroImpar + " são impares.");

    }
}

