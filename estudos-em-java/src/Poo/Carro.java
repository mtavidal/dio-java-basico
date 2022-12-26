package Poo;

public class Carro {
    String modelo;
    String cor;
    int capacidadeTanque;

    //construtor
    Carro() {

    }
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //get e set

    String getCor(){
        return cor;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getModelo(){
        return getModelo();
    }
    void setModelo (String modelo){
        this.modelo = modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //metodos de negocio
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }

}
