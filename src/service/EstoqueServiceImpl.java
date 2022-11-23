package service;

import model.Produto;
import model.TipoProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EstoqueServiceImpl implements EstoqueService {
    GenericService<Produto> service;

    @Override
    public void adicionarMercadoria(Produto produto) {
        service.adicionar(produto);
    }

    @Override
    public void removerMercadoria(Produto product) {
        service.removerProduto(product.getId());
    }

    @Override
    public Integer quantidadeItensPorTipo(TipoProduto tipo) {
        //de acordo com o tipo chama o service apropriado e quantos item retorna na lista de itens
        return service.listaItens().size();
    }

    @Override
    public List<Produto> listagemEstoqueCompleto() {
        //concatena a lista retornada de cada service e retorna
        List<Produto> listaCompleta = new ArrayList<>();
        return listaCompleta;
    }

    @Override
    public Map<TipoProduto, Integer> estoqueCompletoQuantidadePorCategoria() {
        //montar a saída como um map onde envia o tipo com a quantidade total de itens que cada service retornar
        return null;
    }
}
