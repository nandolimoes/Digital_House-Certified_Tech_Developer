package Artigo;

public class Main {

    public static void main(String[] args) {

        Artigo artigo = new Artigo("Artigo 1", 100, 1000);

        System.out.println("O preço de venda é " + artigo.consultarPreco());
    }
}
