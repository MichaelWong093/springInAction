package com.ithuangw.chapter2_beanassemble;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:disc.xml"})
public class CDPlayerTest2 {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();



    @Autowired
    private com.ithuangw.chapter2_beanassemble.BlankDisc blankDisc;

    @Autowired
    private com.ithuangw.chapter2_beanassemble.Discography discography;


    @Test
    public void playX() {
        blankDisc.play();
    }

    @Test
    public void playD() {
        discography.play();
    }
}
