package controller;

import model.Caixa;
import model.Produto;
import service.EstoqueService;

public class LivrariaController implements Compra {

    @Override
    public void comprarMercadoria(Produto produto, Caixa caixa, EstoqueService estoque) {
        estoque.removerMercadoria(produto);
        caixa.setSaldo(caixa.getSaldo() + produto.getPreco());
    }
}
