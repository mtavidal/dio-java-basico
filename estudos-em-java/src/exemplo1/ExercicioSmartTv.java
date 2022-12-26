package exercicio1;

public class ExercicioSmartTv{
   
    public static void main(String[] args) {
        SmartTv tv1 = new SmartTv();
        System.out.println("A tv está ligada? " + tv1.ligada);
        System.out.println("Qual o canal da tv: " + tv1.canal);
        System.out.println("Qual o volume da tv:  " + tv1.volume);

        tv1.ligarTv();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.trocarCanal(11);

        System.out.println("A tv está ligada? " + tv1.ligada);
        System.out.println("Qual o canal da tv: " + tv1.canal);
        System.out.println("Qual o volume da tv:  " + tv1.volume);
    }

}
