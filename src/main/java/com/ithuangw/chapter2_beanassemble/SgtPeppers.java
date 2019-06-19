package com.ithuangw.chapter2_beanassemble;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
@Primary
public class SgtPeppers implements CompactDisc,MarkerI {

    private String title = "Sgt. Pepper's Longly Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
