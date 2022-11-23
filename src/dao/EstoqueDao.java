package dao;

import model.Produto;
import model.TipoProduto;

import java.util.List;
import java.util.Map;

public interface EstoqueDao {
    void adicionarProduto(Produto product);

    void removerProduto(Produto product);

    void verProduto(Long id);

    void alterarProduto(Long id);

    Integer quantidadeItensPorTipo(TipoProduto tipo);

    List<Produto> listagemEstoqueCompleto();

    Map<TipoProduto, Integer> estoqueCompletoQuantidadePorCategoria();

}
