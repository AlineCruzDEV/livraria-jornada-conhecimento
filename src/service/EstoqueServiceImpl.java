package service;

import dao.EstoqueDao;
import dao.EstoqueDaoImpl;
import model.Produto;
import model.TipoProduto;

import java.util.List;
import java.util.Map;

public class EstoqueServiceImpl implements EstoqueService {
    EstoqueDao dao;

    public EstoqueServiceImpl() {
        dao = new EstoqueDaoImpl();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        dao.adicionarProduto(produto);
    }

    @Override
    public void removerProduto(Produto product) {
        dao.removerProduto(product);
    }

    @Override
    public void verProduto(Long id) {
        dao.verProduto(id);
    }

    @Override
    public void alterarProduto(Long id) {
        dao.alterarProduto(id);
    }

    @Override
    public Integer quantidadeItensPorTipo(TipoProduto tipo) {
        return dao.quantidadeItensPorTipo(tipo);
    }

    @Override
    public List<Produto> listagemEstoqueCompleto() {
        return dao.listagemEstoqueCompleto();
    }

    @Override
    public Map<TipoProduto, Integer> estoqueCompletoQuantidadePorCategoria() {
        return dao.estoqueCompletoQuantidadePorCategoria();
    }
}
