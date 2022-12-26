package Poo;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setModelo("tracker");
        carro1.setCor("branco");
        carro1.setCapacidadeTanque(54);
        System.out.println(carro1.totalValorTanque(4.99));
        System.out.println(carro1.getCor());

        Carro carro2 = new Carro("preto", "gol", 43);

    }
}
