package model;

import java.util.List;

public class AlbumMusica extends Produto {
    private List<String> artistas;
    private List<String> generos;
    private List<String> selos;

    public AlbumMusica(Long id, String nome, Double preco, TipoProduto tipoProduto, List<String> artistas, List<String> generos, List<String> selos) {
        super(id, nome, preco, tipoProduto);
        this.artistas = artistas;
        this.generos = generos;
        this.selos = selos;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getSelos() {
        return selos;
    }

    public void setSelos(List<String> selos) {
        this.selos = selos;
    }
}
