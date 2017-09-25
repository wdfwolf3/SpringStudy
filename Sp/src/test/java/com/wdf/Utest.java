package com.wdf;

import com.wdf.auto.Config;
import com.wdf.auto.TestInterface;
import com.wdf.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Utest {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
        ApplicationContext context2 = new ClassPathXmlApplicationContext("Config.xml");
        TestInterface testInterface = (TestInterface) context.getBean("testBean");
//		TestBean testInterface = (TestBean) context.getBean("testBean");
        System.out.println(testInterface.getClass());
        testInterface.scan();

        TestInterface testInterface1 = (TestInterface) context1.getBean("testBean");
        testInterface1.scan();

        TestInterface testInterface2 = (TestInterface) context2.getBean("testBean");
        testInterface2.scan();
    }
}
