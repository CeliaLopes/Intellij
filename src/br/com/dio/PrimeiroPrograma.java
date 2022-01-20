package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato("Celia ", "Azul", "10");
        System.out.println(gato);

        Livro livro = new Livro("A Biblia", 200);
        System.out.println(livro);
    }
}

class Livro{
    private String nome;
    private Integer numPages;

    public Livro(String nome, Integer numPages) {
        this.nome = nome;
        this.numPages = numPages;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}