package com.example.ss3_ex2_music.repository;

import com.example.ss3_ex2_music.model.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class MusicRepository implements IMusicRepository {
    private static ArrayList<Music> musicList = new ArrayList<Music>();
    static{
        musicList.add(new Music(1,"helle","justin","US-UK","hello.mp3"));
    }
    public ArrayList<Music> findALL(){
        return musicList;
    }
    public void addMusic(Music music){
        musicList.add(music);
    }
}
