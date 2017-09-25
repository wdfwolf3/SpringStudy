package com.wdf.auto;

import org.springframework.stereotype.Component;

/**
 * Component注解的类可以被自动扫描或者手动扫描生成bean
 */
@Component()
public class TestBean implements TestInterface {
    public void scan() {
        System.out.println("wdf");
    }
}
