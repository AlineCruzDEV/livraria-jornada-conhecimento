package service;

import dao.AlbumMusicaDao;
import model.AlbumMusica;

public class AlbumMusicaServiceImpl extends AbstractGenericService<AlbumMusica> implements AlbumMusicaService{
    public AlbumMusicaServiceImpl(AlbumMusicaDao dao) {
        super(dao);
    }
}
