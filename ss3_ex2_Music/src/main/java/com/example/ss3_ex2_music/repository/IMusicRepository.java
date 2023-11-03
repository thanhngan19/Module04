package com.example.ss3_ex2_music.repository;

import com.example.ss3_ex2_music.model.Music;

import java.util.ArrayList;

public interface IMusicRepository {
    ArrayList<Music> findALL();
    void addMusic(Music music);
}
