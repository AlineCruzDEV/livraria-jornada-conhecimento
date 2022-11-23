package service;

import java.util.List;

public interface GenericService<T> {

    void adicionar(T product);
    T verItem();
    List<T> listaItens();
    void alterar(T product);
    void removerProduto(Long id);
}
