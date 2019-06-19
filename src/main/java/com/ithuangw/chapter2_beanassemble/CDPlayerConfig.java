package com.ithuangw.chapter2_beanassemble;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan 注解启用了组件扫描
 * 如果没有其他配置的话，默认扫描与配置类同一个包的类
 */

@Configuration
//@Import(value = {CDConfig.class})
@ComponentScan(basePackages = "com.ithuangw.chapter2_beanassemble")
public class CDPlayerConfig {

    /*@Bean
    public MediaPlayer cdPlayer1() {
        System.out.println("order: CDPlayer1 Initialization");
        return new CDPlayer(sgtPepper());
    }

    @Bean
    public MediaPlayer cdPlayer2() {
        System.out.println("order: CDPlayer2 Initialization");
        return new CDPlayer(sgtPepper());
    }*/

    @Bean
    public MediaPlayer cdPlayer3(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    @Bean
    public MediaPlayer cdPlayer4(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        //cdPlayer.setCd(compactDisc);
        return cdPlayer;
    }

   /* @Bean
    public CompactDisc sgtPepper() {
        System.out.println("order invoke initialization CompactDisc");
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            System.out.println("order invoke initialization CompactDisc0");
            return new SgtPeppers();
        } else if (choice == 1) {
            System.out.println("order invoke initialization CompactDisc1");
            return new SgtPeppers2();
        }else{
            System.out.println("order invoke initialization CompactDisc23");
            return new SgtPeppers2();
        }

    }*/
}
