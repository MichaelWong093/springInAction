package com.ithuangw.chapter2_beanassemble;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers2 implements CompactDisc,MarkerI {

    private String title = "Sgt. Pepper2's Longly Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
