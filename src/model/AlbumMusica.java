package model;

import java.util.List;

public class AlbumMusica extends Produto {
    List<String> artistas;
    List<String> generos;
    List<String> selos;

    public AlbumMusica(Long id, String nome, Double preco, List<String> artistas, List<String> generos, List<String> selos) {
        super(id, nome, preco);
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
