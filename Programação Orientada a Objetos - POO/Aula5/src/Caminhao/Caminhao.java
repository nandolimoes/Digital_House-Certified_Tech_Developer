package Caminhao;

public class Caminhao {
    private String marca;
    private String patente;
    static private double valorCombustivel;

    public Caminhao(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }
    public double gastoCombustivel(int litros) {
        return litros + Caminhao.valorCombustivel;
    }
    static public void mudarPrecoCombustivel(double preco) {
        Caminhao.valorCombustivel = preco;
    }

}
