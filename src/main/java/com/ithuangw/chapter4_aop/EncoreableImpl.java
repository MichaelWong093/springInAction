package com.ithuangw.chapter4_aop;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 16:00
 */
public class EncoreableImpl implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("live is so crazy , can't love it more");
    }
}
