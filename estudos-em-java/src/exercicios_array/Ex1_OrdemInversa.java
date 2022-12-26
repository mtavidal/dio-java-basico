package exercicios_array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros;
        numeros = new int[6];


        for (int i = 0; i < 6; i++) {
            System.out.println("Escreva o número: ");
            numeros [i] = scanner.nextInt();
        }
        System.out.println( "vetor: "+ Arrays.toString(numeros));
        System.out.print("Vetor invertido: ");
        for (int i = 5; i >=0 ; i--) {
            System.out.print(numeros[i] +" ");
        }



    }
}
