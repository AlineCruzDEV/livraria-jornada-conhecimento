package service;

import dao.LivroDao;
import model.Livro;

public class LivroServiceImpl extends AbstractGenericService<Livro> {

    public LivroServiceImpl(LivroDao dao) {
        super(dao);
    }
}
