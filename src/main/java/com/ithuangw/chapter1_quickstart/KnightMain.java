package com.ithuangw.chapter1_quickstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:cofig/knights.xml");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        //Knight knight = context.getBean(Knight.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkedOnQuest();
        context.close();
    }
}
