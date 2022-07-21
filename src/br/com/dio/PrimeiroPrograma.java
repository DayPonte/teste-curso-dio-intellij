package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {


    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        livro Livro1 = new livro("A",100);
        System.out.println(Livro1);
    }
}

class livro {
    private String nome;
    private Integer numPaginas;

    public livro(String a, int i) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
