package br.com.digitalhouse;

import br.com.digitalhouse.models.UsuarioJogo;

public class Main {

    public static void main(String[] args) {
        UsuarioJogo player1 = new UsuarioJogo("Fernando", "TioNandoBH");
        player1.aumentarNivel();
        player1.aumentarPontuacao();
        player1.bonus(10);
    }
}
