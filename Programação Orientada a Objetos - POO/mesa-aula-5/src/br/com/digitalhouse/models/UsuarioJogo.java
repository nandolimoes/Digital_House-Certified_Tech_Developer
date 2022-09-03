/*Para desenvolver um jogo, precisamos implementar a classe UsuarioJogo. Os usuários
        possuem nome e um nickname, e estes dados devem ser fornecidos ao criar um novo
        usuário. Inicialmente, a pontuação é zero. Porém, eles podem aumentar esse nível em 1.
        Assim, devemos fornecer um método para realizar esse aumento. O usuário também pode
        receber um bônus, ou seja, um valor extra que é acrescentado em sua pontuação.
        UsuarioJogo
        - nome: String
        - nickname: String
        - pontuacao: int
        - nivel: int
        + UsuarioJogo(nome: String, nickname:
        String)
        + aumentarPontuacao(): void
        + subirNivel(): void
        + bonus( valor: int): void
        Exercício
        Com base no diagrama de classe, implemente o código da classe UsuarioJogo para provar que
        o diagrama criado é válido. Crie dois objetos da classe UsuarioJogo com pontuações e níveis
        diferentes.*/
package br.com.digitalhouse.models;

public class UsuarioJogo {
    private String nome;
    private String apelido;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public void aumentarNivel() {
        this.nivel ++;
        System.out.println("O nível  do " + this.apelido + " subiu para " + this.nivel);
    }

    public void bonus(int pontos){
        this.pontuacao += pontos;
        System.out.println(this.apelido + " está com " + this.pontuacao + " pontos.");
    }

    public void aumentarPontuacao(){
        this.pontuacao ++;
        System.out.println(this.apelido + " está com " + this.pontuacao + " pontos.");
    }
}
