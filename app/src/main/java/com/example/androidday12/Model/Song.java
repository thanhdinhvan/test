package com.example.androidday12.Model;

public class Song {
    private String name;
    private int img;
    private String caSi;

    public Song(String name, int img, String caSi) {
        this.name = name;
        this.img = img;
        this.caSi = caSi;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }
}
