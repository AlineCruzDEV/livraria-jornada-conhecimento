package service;

import dao.GenericProductDao;

import java.util.List;

public abstract class AbstractGenericService<T> implements GenericService<T> {

    private GenericProductDao<T> dao;

    public AbstractGenericService(GenericProductDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public void adicionar(T product) {
        dao.adicionar(product);
    }

    @Override
    public List<T> verItem() {
        return dao.verItem();
    }

    @Override
    public void alterar(T product) {
        dao.alterar(product);
    }

    @Override
    public void removerProduto(Long id) {
        dao.removerProduto(id);
    }
}
