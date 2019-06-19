package com.ithuangw.config;


import com.ithuangw.chapter1_quickstart.ResumeQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public com.ithuangw.chapter1_quickstart.Knight knight() {
        return new com.ithuangw.chapter1_quickstart.BraveKnight(quest());
    }

    @Bean
    public com.ithuangw.chapter1_quickstart.Quest quest() {
        return new ResumeQuest(System.out);
    }

    /*@Bean(destroyMethod = "shutdown")
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schma.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }*/
}
