package exercicios_array;

import sun.security.ssl.HandshakeOutStream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntConsoantes = 0;

        int cont = 0;

        do{
            System.out.println("Digite uma letra:");
            String letra = scanner.next();
            if ( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                consoantes[cont] = letra;
                qntConsoantes++;
            }

            cont++;

        } while (cont < consoantes.length);


        for ( String consoante : consoantes ) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

    }
}
