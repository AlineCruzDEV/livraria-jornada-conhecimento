package service;

import dao.FilmeDao;
import model.Filme;

public class FilmeServiceImpl extends AbstractGenericService<Filme> {
    public FilmeServiceImpl(FilmeDao dao) {
        super(dao);
    }
}
