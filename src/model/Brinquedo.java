package model;

public class Brinquedo extends Produto {
    String tipo;

    public Brinquedo(Long id, String nome, Double preco) {
        super(id, nome, preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
