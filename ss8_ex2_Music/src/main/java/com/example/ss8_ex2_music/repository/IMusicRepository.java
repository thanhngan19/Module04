package com.example.ss8_ex2_music.repository;

import com.example.ss8_ex2_music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music,Integer> {
    Page<Music> findMusicByNameContaining(Pageable pageable, String name);
}