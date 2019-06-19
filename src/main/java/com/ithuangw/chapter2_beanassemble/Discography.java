package com.ithuangw.chapter2_beanassemble;

import java.util.List;

public class Discography {

    private String artist;
    private List<CompactDisc> cds;

    /*public Discography(String artist, List<CompactDisc> cds) {
        this.artist = artist;
        this.cds = cds;
    }*/

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setCds(List<CompactDisc> cds) {
        this.cds = cds;
    }

    public void play() {
        System.out.println("artist is " + artist);
        for (CompactDisc cd : cds) {
            cd.play();
        }
    }
}
