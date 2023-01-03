package Desafios;

import java.util.Scanner;

class Primo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        long numero = scanner.nextLong();

        System.out.println(isPrime(numero));
       
    }
        public static int isPrime(long n){
            if (n % 2 == 0 && n!=2){
                return 2;
            }
            if (n % 3 == 0 && n!=3){
                return 3;
            }
            if (n % 5 == 0 && n!=5){
                return 5;
            }
            if (n % 7 == 0 && n!=7){
                return 7;
            }
            return 1;
            
        }

}