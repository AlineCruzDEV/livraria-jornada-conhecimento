package model;

import java.util.List;

public class Livro extends Produto {
    private List<String> generos;
    private String escritor;
    private String editora;

    public Livro(Long id, String nome, Double preco) {
        super(id, nome, preco);
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
