package com.ithuangw.chapter4_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Huangw
 * @title: 唱片磁道播放数量
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 15:25
 */
@Aspect
@Component
public class TrackCounter {

    private Map<Integer,Integer> trackCounts = new HashMap<Integer,Integer>();

    @Pointcut("execution(* com.ithuangw.chapter4_aop.CompactDisc.play(int))" +
            "&& args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount+1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber)
                ? trackCounts.get(trackNumber) : 0;
    }
}
