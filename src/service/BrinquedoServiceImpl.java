package service;

import dao.BrinquedoDao;
import model.Brinquedo;

public class BrinquedoServiceImpl extends AbstractGenericService<Brinquedo> {
    public BrinquedoServiceImpl(BrinquedoDao dao) {
        super(dao);
    }
}
