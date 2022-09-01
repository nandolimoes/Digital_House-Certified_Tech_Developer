package DigitalHouse.usuarioGame;

public class UsuarioGame {

    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel;

    public UsuarioGame(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }
    public void aumentarPontuacao() {
        this.pontuacao += 1;
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public void bonus(int valor) {
        if(this.pontuacao > 0) {
            this.pontuacao += valor;
        }

    }
}
