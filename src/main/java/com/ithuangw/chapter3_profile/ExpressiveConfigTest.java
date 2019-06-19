package com.ithuangw.chapter3_profile;

import com.ithuangw.chapter2_beanassemble.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ExpressiveConfig.class})
public class ExpressiveConfigTest {

    @Autowired
    private BlankDisc cd;

    @Test
    public void test() {
        cd.play();
    }
}