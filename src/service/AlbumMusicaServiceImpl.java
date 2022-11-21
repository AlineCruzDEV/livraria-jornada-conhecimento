package service;

import dao.AlbumMusicaDao;
import model.AlbumMusica;

public class AlbumMusicaServiceImpl extends AbstractGenericService<AlbumMusica> {
    public AlbumMusicaServiceImpl(AlbumMusicaDao dao) {
        super(dao);
    }
}
