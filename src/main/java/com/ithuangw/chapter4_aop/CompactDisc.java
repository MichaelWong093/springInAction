package com.ithuangw.chapter4_aop;

import org.springframework.stereotype.Component;

/**
 * @author Huangw
 * @title: 唱片
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 14:40
 */
@Component
public class CompactDisc {

    public void play(int trackNumber) {
        System.out.println("play "+trackNumber);
    }

}
