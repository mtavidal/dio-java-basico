package exercicios_loop;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial;
        int resultado = 1;

        System.out.println("Digite o número que deseja ver o fatorial: ");
        fatorial = scanner.nextInt();
        for (int i = fatorial; i > 0; i--) {
            resultado *= i;
        }
        System.out.println(fatorial + "! = " + resultado);
    }
}
