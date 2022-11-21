package service;

import dao.JogoDao;
import model.Jogo;

public class JogoServiceImpl extends AbstractGenericService<Jogo> {
    public JogoServiceImpl(JogoDao dao) {
        super(dao);
    }
}
