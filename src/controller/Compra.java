package controller;

import model.Caixa;
import model.Produto;
import service.EstoqueService;

public interface Compra {
    void comprarMercadoria(Produto produto, Caixa caixaAtual, EstoqueService estoque);
}
