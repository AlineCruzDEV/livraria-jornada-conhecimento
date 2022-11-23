package dao;

import model.Produto;
import model.TipoProduto;

import java.util.List;
import java.util.Map;

public class EstoqueDaoImpl implements EstoqueDao {

    @Override
    public void adicionarProduto(Produto product) {
        System.out.println("Adicionando produto ao estoque: " + product.getTipoProduto() + " - " + product.getNome());
    }

    @Override
    public void removerProduto(Produto product) {
        System.out.println("REmovendo produto");
    }

    @Override
    public void verProduto(Long id) {
        System.out.println("Vendo produto");
    }

    @Override
    public void alterarProduto(Long id) {
        System.out.println("Alterando produto");
    }

    @Override
    public Integer quantidadeItensPorTipo(TipoProduto tipo) {
        System.out.println("Vendo quantidade de itens por categoria");
        return null;
    }

    @Override
    public List<Produto> listagemEstoqueCompleto() {
        System.out.println("Vendo estoque completo");
        return null;
    }

    @Override
    public Map<TipoProduto, Integer> estoqueCompletoQuantidadePorCategoria() {
        System.out.println("Vendo estoque - quantidade por categoria");
        return null;
    }
}
