package com.ithuangw.chapter4_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/12 16:04
 */
@Aspect
@Component
public class EncoreableIntroducer {

    /**
     * value中"+"表示DiscI的所有子类型，而不是DiscI本身
     */
    @DeclareParents(value = "com.ithuangw.chapter4_aop.DiscI+",defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;
}
