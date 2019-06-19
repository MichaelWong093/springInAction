package com.ithuangw.chapter3_profile;

import com.ithuangw.chapter2_beanassemble.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Configuration
@PropertySource("classpath:cofig/app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist"),
                Arrays.asList(env.getProperty("disc.tracks").split(","))
        );
    }
}
