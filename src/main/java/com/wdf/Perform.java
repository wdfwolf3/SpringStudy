package com.wdf;

import org.springframework.stereotype.Component;

/**
 * Created by wdfwolf3 on 2017/2/22.
 */
@Component
public class Perform implements Performance {
    public void perform() {
        System.out.println("perform");
    }

    public void play(int n) {
        System.out.println(n + "wdf");
    }
}
