package service;

import java.util.List;

public interface GenericService<T> {

    void adicionar(T product);
    List<T> verItem();
    void alterar(T product);
    void removerProduto(Long id);
}
