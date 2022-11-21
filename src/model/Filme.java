package model;

import java.util.List;

public class Filme extends Produto {
    List<String> diretores;
    List<String> generos;
    List<String> produtores;
    String estudio;

    public Filme(Long id, String nome, Double preco) {
        super(id, nome, preco);
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
