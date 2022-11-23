package controller;

import model.Caixa;
import model.Produto;
import service.EstoqueService;

public class LivrariaController implements Compra {

    @Override
    public void comprarMercadoria(Produto produto, Caixa caixa, EstoqueService estoque) {
        System.out.println("Realizando venda de " + produto.getTipoProduto() + " - " + produto.getNome() + " no valor de: " + produto.getPreco());
        estoque.removerProduto(produto);
        caixa.setSaldo(caixa.getSaldo() + produto.getPreco());
    }
}
