package com.ithuangw.chapter2_beanassemble;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:disc.xml")
public class SoundSystemConfig {
}
