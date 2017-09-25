package com.wdf.aspect;

/**
 * Created by wdfwolf3 on 2017/2/28.
 */
public class CriticAspect {
//    pointcut performance() : execution(* perform(..));
//
//    afterReturing() : performance(){
//        System.out.println(criticismEngine.getCriticism());
//    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
