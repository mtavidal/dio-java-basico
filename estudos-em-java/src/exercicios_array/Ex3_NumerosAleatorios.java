package exercicios_array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros [] = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int numero = scanner.nextInt();
            if (numero>= 0 && numero<=100) {
                numeros[i] = numero;
            } else{
                System.out.println("Número inválivo, digite um número de 0 a 100:");
                numero = scanner.nextInt();
                numeros[i] = numero;
            }
        }
        System.out.println( "vetor: "+ Arrays.toString(numeros));
        System.out.print( "vetor dos sucessores: [");
        for ( int numero: numeros) {
            System.out.print( (numero+1 + " "));
        }
        System.out.print( "]");
    }
}
