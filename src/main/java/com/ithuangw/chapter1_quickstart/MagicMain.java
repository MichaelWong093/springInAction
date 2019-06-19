package com.ithuangw.chapter1_quickstart;

import com.ithuangw.config.MagicBean;
import com.ithuangw.config.MagicConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MagicMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MagicConfig.class);
        MagicBean magicBean = context.getBean(MagicBean.class);

        magicBean.test();

    }
}
