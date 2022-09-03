package integracao2;

import integracao2.Models.Impressora;

public class Main {
    public static void main(String[] args) {

        Impressora impressoraWireless = new Impressora("Epson", "Wi-Fi", 10);
        Impressora impressoraComFio = new Impressora("Cannon", "USB");

        impressoraWireless.imprimir("Olá");
        impressoraComFio.imprimir("Hello");

        System.out.println(impressoraComFio.getDataFabricacao());


    }
}
