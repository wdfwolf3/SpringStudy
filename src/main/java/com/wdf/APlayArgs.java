package com.wdf;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by wdfwolf3 on 2017/2/28.
 */
@Aspect
public class APlayArgs {
    @Pointcut("execution(* com.wdf.Performance.play(int))&&args(n)")
    public void weavePlay(int n) {
    }

    @Before("weavePlay(n)")
    public void weaPlay(int n) {
        System.out.println("silen" + n);
    }
}
