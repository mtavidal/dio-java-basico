package exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class UsandoScanner{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Meu nome é " + nome);

    }

}
