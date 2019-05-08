package com.company;

public class Song {
    private String artist;
    private String title;


    public Song() {
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String display(){
        return getTitle() + getArtist();
    }
}
