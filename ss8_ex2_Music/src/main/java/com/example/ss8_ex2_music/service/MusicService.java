package com.example.ss8_ex2_music.service;

import com.example.ss8_ex2_music.model.Music;
import com.example.ss8_ex2_music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService{
    @Autowired
    IMusicRepository service;
    @Override
    public Page<Music> findAll(Pageable pageable, String name) {
        return service.findMusicByNameContaining(pageable,name);
    }

    @Override
    public void update(Music music) {
       service.save(music);
    }

    @Override
    public Music findById(int id) {
        return service.findById(id).orElse(null);
    }
}
