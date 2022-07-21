package br.com.dio.model;

public class Gato {
    private String nome;
    private String cor;
    private String Integer;


    public Gato(String nome, String cor, String integer) {
        this.nome = nome;
        this.cor = cor;
        Integer = integer;
    }

    public Gato() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getInteger() {
        return Integer;
    }

    public void setIntager(String integer) {
        Integer = integer;
    }

}
