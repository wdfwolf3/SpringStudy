package com.wdf.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by wdfwolf3 on 2017/2/28.
 */
@Component
public class CriticismEngineImpl implements CriticismEngine {
    private String[] criticismPool;

    public String getCriticism() {
        int i = 1;
        return criticismPool[i];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
