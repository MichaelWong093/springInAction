package com.ithuangw.chapter3_profile;

import com.ithuangw.chapter2_beanassemble.CompactDisc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc3 implements CompactDisc {

    @Value("#{'ffff'}")
    private String title;

    @Value("#{systemProperties['disc.artist']}")
    private String artist;
/*
    public BlankDisc3(@Value("${disc.title}") String title,
                      @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }*/

    /*public BlankDisc3( @Value("${disc.title}")String title, @Value("${disc.artist}")String artist) {
        this.title = title;
        this.artist = artist;
    }*/

    /*public BlankDisc3( @Value("#{systemProperties['disc.title']}")String title, @Value("#{systemProperties['disc.artist']}")String artist) {
        this.title = title;
        this.artist = artist;
    }*/

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
