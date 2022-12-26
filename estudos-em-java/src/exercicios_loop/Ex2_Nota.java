package exercicios_loop;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        while (true) {
            System.out.println("Digite uma nota: ");
            nota = scanner.nextInt();
            if ((nota >=0) && (nota <= 10)) {
                break;
            } else {
                System.out.println("Nota inválida");
                System.out.println("-----------------------");
            }
        }

        System.out.println("Nota válida");

    }

}
