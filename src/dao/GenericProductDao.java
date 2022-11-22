package dao;

import java.util.List;

public interface GenericProductDao<T> {
    void adicionar(T product);
    List<T> verItem();
    void alterar(T product);
    void removerProduto(Long id);
}
