package Desafios;

import java.util.Scanner;

public class LeituraDeGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
        int totalDias = paginas/paginasLidas;
        System.out.println(totalDias +" dias");

    }

}
