package DigitalHouse.aula5.exercicioguiado.models;

public class Cliente {

    private String nome;
    private int numeroCliente;
    private double divida; //private static double divida

    public Cliente(String nome, int numeroCliente) {
        this.nome = nome;
        this.numeroCliente = numeroCliente;
        this.divida = 0; //cliente.divida = 0
    }

    public void aumentarDivida(double valor) {
        this.divida += valor; //this.divida = this.divida + valor;
    }

    public void pagarDivida(double valor) {
        if(this.divida - valor >= 0) {
            this.divida -= valor;
        }
    }

}
