package com.songr.songr;


public class Album {
    private String title;
    private String artist;
    private String songCount;
    private String length;
    private String  imageUrl;

    public Album(String title, String artist, String songCount, String length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getSongCount() {
        return songCount;
    }

    public String getLength() {
        return length;
    }

    public String  getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(String songCount) {
        this.songCount = songCount;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}