package dao;

import java.util.List;

public interface GenericProductDao<T> {
    void adicionar(T product);
    T verItem();
    List<T> listaItens();
    void alterar(T product);
    void removerProduto(Long id);
}
