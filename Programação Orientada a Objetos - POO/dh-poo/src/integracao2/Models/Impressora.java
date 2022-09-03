/*Exercício de codificação
        Exercício 1
        Codifique a classe Impressora em Java conforme mostra o diagrama de classe. As impressoras têm um modelo, um tipo de conexão, existem impressoras que são USB e outras sem fio. Elas têm uma data de fabricação e todas sabem a quantidade de folhas disponíveis.

        Impressora
        -	modelo: String
        -	tipoConexao: String
        -	dataFabricacao: Date
        -	folhasDisponiveis: Int
        -	temPapel(): boolean
        +	imprimir(texto:String)*/


package integracao2.Models;

import java.util.Calendar;
import java.util.Date;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private int folhasDisponiveis;
    private Date dataFabricacao;

    public Impressora(String modelo, String tipoConexao){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,8,9);
        this.dataFabricacao = calendar.getTime();
        this.folhasDisponiveis = 0;
    }

    public Impressora(String modelo, String tipoConexao, int numeroDeFolhas){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        Calendar calendar = Calendar.getInstance();
        this.dataFabricacao = calendar.getTime();
        this.folhasDisponiveis = numeroDeFolhas;
    }

    private boolean temPapel(){
        return this.folhasDisponiveis > 0;
    }
    public void imprimir(String texto) {
        //quando n pede pra retornar colocar void
        if(temPapel()){
            System.out.println(texto);
        } else {
            System.out.println("Não tem papel!");
        }
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }
}


