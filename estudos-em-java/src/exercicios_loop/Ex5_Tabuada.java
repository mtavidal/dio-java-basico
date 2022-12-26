package exercicios_loop;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabuada;
        int resultado = 0;

        System.out.println("Digite o número que deseja ver a tabuada: ");
        tabuada = scanner.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
             resultado = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + resultado);
        }


    }
}
