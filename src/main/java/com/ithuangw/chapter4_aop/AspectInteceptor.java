package com.ithuangw.chapter4_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Huangw
 * @title: 切面拦截器
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 11:44
 */
@Aspect
@Component
public class AspectInteceptor {

    @Pointcut("execution(* com.ithuangw.chapter4_aop.Disc.play())")
    public void log() { }

    @Before("log()")
    public void before() {
        System.out.println("before: you smile is so beautiful!");
    }

    @After("log()")
    public void after() {
        System.out.println("after: i wish you always happy!");
    }

    @Around("log()")
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("around be: wow ,so cool!");
            joinPoint.proceed();
            System.out.println("around af: amazing!");
        } catch (Throwable throwable) {
            System.out.println("throw a exception!");
        }
    }


}
