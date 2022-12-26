package exercicios_metodos01;

public class Mensagem {
    public static String enviaMensagem (int hora){
        if (hora>=5 && hora<12){
            return "Bom dia!";
        } else if (hora>=12 && hora<18) {
            return "Boa Tarde!";
        } else {
            return "Boa Noite!";
        }
    }
}
