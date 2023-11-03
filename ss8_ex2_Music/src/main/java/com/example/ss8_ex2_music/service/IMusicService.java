package com.example.ss8_ex2_music.service;

import com.example.ss8_ex2_music.dto.MusicDto;
import com.example.ss8_ex2_music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMusicService{
    Page<Music> findAll(Pageable pageable,String name);
    void update(Music music);
    Music findById(int id);
}
