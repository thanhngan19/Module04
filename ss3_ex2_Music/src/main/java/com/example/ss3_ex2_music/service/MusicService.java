package com.example.ss3_ex2_music.service;

import com.example.ss3_ex2_music.model.Music;
import com.example.ss3_ex2_music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class MusicService implements IMusicService{
    @Autowired
    IMusicRepository service;
    @Override
    public ArrayList<Music> findALL() {
        return service.findALL();
    }

    @Override
    public void addMusic(Music music) {
        service.addMusic(music);
    }
}
