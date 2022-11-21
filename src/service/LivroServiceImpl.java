package service;

import dao.LivroDao;
import model.Livro;

public class LivroServiceImpl extends AbstractGenericService<Livro> implements LivroService{

    public LivroServiceImpl(LivroDao dao) {
        super(dao);
    }
}
