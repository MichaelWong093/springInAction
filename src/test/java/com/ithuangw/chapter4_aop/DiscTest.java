package com.ithuangw.chapter4_aop;

import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Huangw
 * @title:
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 14:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DiscConfig.class})
public class DiscTest {

    //@Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private DiscI disc;

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void play() {
        disc.play();
        Encoreable encoreable = (Encoreable) disc;
        encoreable.performEncore();
    }

    @Test
    public void playTrack() {
        compactDisc.play(12);
        compactDisc.play(13);
        compactDisc.play(13);
        compactDisc.play(13);
        assertEquals(1,trackCounter.getPlayCount(12));
        assertEquals(2,trackCounter.getPlayCount(13));
        assertEquals(0,trackCounter.getPlayCount(14));
    }
}