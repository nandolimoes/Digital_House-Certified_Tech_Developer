package Artigo;

public class Artigo {

    private String descricao;
    private double precoVenda;
    private int estoque;

    public Artigo(String descricao, int estoque, double preco) {
        this.descricao = descricao;
        this.precoVenda = preco;
        this.estoque = estoque;


    }

    public void setDescricao(String Descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean existeEstoque(){
        return estoque > 0;
    }

    public double consultarPreco(){
        return precoVenda;
    }






}
