package com.wdf;

import com.wdf.wiring.AutoWiringConfig;
import com.wdf.wiring.TestWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wdfwolf3 on 2017/2/28.
 */


public class WiringTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiringConfig.class);
        TestWiring testWiring = (TestWiring) context.getBean("testWiringImpl");
        testWiring.play();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AutoWiringConfig.class);
        TestWiring testWiring1 = (TestWiring) context1.getBean("testWiringImpl");
        testWiring1.play();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(AutoWiringConfig.class);
        TestWiring testWiring2 = (TestWiring) context2.getBean("testWiringImpl");
        testWiring2.play();
    }
}
