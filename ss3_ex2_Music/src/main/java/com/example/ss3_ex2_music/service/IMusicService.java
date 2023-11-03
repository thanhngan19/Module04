package com.example.ss3_ex2_music.service;

import com.example.ss3_ex2_music.model.Music;

import java.util.ArrayList;

public interface IMusicService {
    ArrayList<Music> findALL();
    void addMusic(Music music);
}
