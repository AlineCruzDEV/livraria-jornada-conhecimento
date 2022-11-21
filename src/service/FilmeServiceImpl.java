package service;

import dao.FilmeDao;
import model.Filme;

public class FilmeServiceImpl extends AbstractGenericService<Filme> implements FilmeService {
    public FilmeServiceImpl(FilmeDao dao) {
        super(dao);
    }
}
