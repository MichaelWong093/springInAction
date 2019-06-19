package com.ithuangw.chapter2_beanassemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        System.out.println("order: CDPlayer Injection");
        this.cd = cd;
    }

    public void play() {
        //System.out.println("order: CDPlayer.play()");
        cd.play();
    }

    //@Autowired
    //@Qualifier("lonelyHeartsClub")
    //public void setCd(CompactDisc cd) {
    //    System.out.println("order 2");
        //this.cd = cd;
    //}
}
