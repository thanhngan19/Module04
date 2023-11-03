package com.example.ss8_ex2_music.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MusicDto implements Validator {
    private int id;
    private String name;
    private String singer;
    private String category;

    public MusicDto(int id, String name, String singer, String category) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
    }

    public MusicDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        MusicDto musicDto = (MusicDto) target;
        if(musicDto.getName().isEmpty()){
            errors.rejectValue("name", null,"tên ko để trống");
        }
        else if( musicDto.getName().length()>800){
            errors.rejectValue("name", null,"tên ko vượt qua 800");
        }
        else if(!musicDto.getName().matches("^[a-zA-Z0-9\\s]+$")){
            errors.rejectValue("name", null,"tên ko chứa lý tự đặc biệt");
        }
        else if(musicDto.getSinger().isEmpty()){
            errors.rejectValue("singer", null,"tên ca sí ko ddeer trống");
        }
        else if( musicDto.getSinger().length()>300){
            errors.rejectValue("singer", null,"tên ko vượt qua 300");
        }
        else if(! musicDto.getSinger().matches("^[a-zA-Z0-9\\s]+$")){
            errors.rejectValue("name", null,"tên ko chứa ký tự đặc biệt");
        }
        else if(musicDto.getCategory().isEmpty()){
            errors.rejectValue("category", null,"tên ko dc để trống");
        }
        else if(musicDto.getCategory().length()>1000){
            errors.rejectValue("category", null,"tên ko vượt quá 1000");
        }
        else if(!musicDto.getCategory().matches("^[a-zA-Z0-9\\s,]+$")){
            errors.rejectValue("category", null,"k chứa ký tự đặc biệt");

        }

    }
}
