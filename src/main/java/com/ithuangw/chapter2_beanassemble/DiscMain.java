package com.ithuangw.chapter2_beanassemble;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiscMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:cofig/disc.xml");
        //SgtPeppers sgtPeppers = context.getBean(SgtPeppers.class);
        //SgtPeppers sgtPeppers = (SgtPeppers) context.getBean("lonelyHeartsClub")  ;
        //sgtPeppers.play();
        //CDPlayer cdPlayer= (CDPlayer) context.getBean("cdPlayer1");
        //CDPlayer cdPlayer2= (CDPlayer) context.getBean("cdPlayer2");
        CDPlayer cdPlayer3= (CDPlayer) context.getBean("cdPlayer3");
        //cdPlayer.play();
        //cdPlayer2.play();
        cdPlayer3.play();
        context.getBean(BlankDisc.class).play();
    }
}
