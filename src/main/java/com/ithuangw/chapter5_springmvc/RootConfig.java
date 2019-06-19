package com.ithuangw.chapter5_springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/13 11:17
 */
@Configuration
@ComponentScan(excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}
