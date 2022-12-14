package model;

import java.util.List;

public class Jogo extends Produto {
    private List<String> generos;
    private String distribuidora;
    private String estudio;

    public Jogo(Long id, String nome, Double preco, TipoProduto tipoProduto, List<String> generos, String distribuidora, String estudio) {
        super(id, nome, preco, tipoProduto);
        this.generos = generos;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
