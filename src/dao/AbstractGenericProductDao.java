package dao;

import java.util.List;

public abstract class AbstractGenericProductDao<T> implements GenericProductDao<T> {
    @Override
    public void adicionar(T product) {

    }

    @Override
    public List<T> verTodos() {
        return null;
    }

    @Override
    public void alterar(T product) {

    }

    @Override
    public void removerProduto(Long id) {

    }
}
