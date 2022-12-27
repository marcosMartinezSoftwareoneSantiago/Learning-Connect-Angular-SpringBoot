package com.example.ejercicionavidades.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicionavidades.models.daos.IAlbumDAO;
import com.example.ejercicionavidades.models.entities.Album;
import com.example.ejercicionavidades.models.entities.Grupo;

@Service
public class AlbumService {
    
    @Autowired
    private IAlbumDAO albumDao;

    public Album save(Grupo grupo, String name){
        Album album = new Album(grupo, name);
        return this.albumDao.save(album);
    }

    public List<Album> list(){
        return this.albumDao.findAll();
    }
}
