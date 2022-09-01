package Artigo;

public class Artigo {

    private String descricao;
    private double preco_venda;
    private int estoque;

    public Artigo(String descricao, int quantidade, double preco) {
        this.descricao = descricao;
        this.preco_venda = preco;
        this.estoque = quantidade;

    }
    public boolean temEstoque() {
        return estoque;
    }
    public double consultarPreco() {
        return preco_venda;
    }
}
