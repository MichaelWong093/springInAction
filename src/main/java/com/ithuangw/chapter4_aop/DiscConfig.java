package com.ithuangw.chapter4_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Huangw
 * @title: 自动扫描
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 14:47
 */
@Configuration
@EnableAspectJAutoProxy
//@ImportResource(locations = {"aop.xml"})
@ComponentScan
public class DiscConfig {

}
