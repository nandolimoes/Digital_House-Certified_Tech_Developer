package Caminhao;

import Caminhao.Caminhao;

public class Main {

    public static void main(String[] args) {

        Caminhao meuCaminhao = new Caminhao("Ford", "AB XXX CD");

        Caminhao.mudarPrecoCombustivel(98.50);

        System.out.println("Gasto " + meuCaminhao.gastoCombustivel(40));
    }
}
