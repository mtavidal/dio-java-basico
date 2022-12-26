package exercicios_loop;
import java.util.Scanner;
public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        do {
            System.out.println("Escreva o nome do aluno: ");
            nome = scanner.next();
            if (nome.equals("0")) break;
            System.out.println("Escreva a idade do aluno: ");
            idade = scanner.nextInt();
        } while (!nome.equals("0"));


    }
}
