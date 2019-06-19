package com.ithuangw.chapter3_profile;

import com.ithuangw.chapter2_beanassemble.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig2.class)
public class ExpressiveConfig2Test {

    @Autowired
    private CompactDisc blankDisc3;

    @Test
    public void test() {
        blankDisc3.play();
    }
}