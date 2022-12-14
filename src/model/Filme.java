package model;

import java.util.List;

public class Filme extends Produto {
    private List<String> diretores;
    private List<String> generos;
    private List<String> produtores;
    private String estudio;

    public Filme(Long id, String nome, Double preco, TipoProduto tipoProduto, List<String> diretores, List<String> generos, List<String> produtores, String estudio) {
        super(id, nome, preco, tipoProduto);
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
        this.estudio = estudio;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<String> diretores) {
        this.diretores = diretores;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(List<String> produtores) {
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
