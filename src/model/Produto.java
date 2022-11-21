package model;

public abstract class Produto {
    Long id;
    String nome;
    Double preco;

    public Produto(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}

