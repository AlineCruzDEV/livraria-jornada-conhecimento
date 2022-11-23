package model;

public enum TipoProduto {
    ALBUM("Album"),
    BRINQUEDO("Brinquedo"),
    FILME("Filme"),
    JOGO("Jogo"),
    LIVRO("Livro");

    private final String tipoProduto;
    TipoProduto(String tipo) {
        tipoProduto = tipo;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }
}
