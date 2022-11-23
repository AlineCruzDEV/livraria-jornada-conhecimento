package service;

import model.Produto;
import model.TipoProduto;

import java.util.List;
import java.util.Map;

public interface EstoqueService {

    void adicionarMercadoria(Produto product);

    void removerMercadoria(Produto product);

    Integer quantidadeItensPorTipo(TipoProduto tipo);

    List<Produto> listagemEstoqueCompleto();

    Map<TipoProduto, Integer> estoqueCompletoQuantidadePorCategoria();

}
