package com.wdf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wdfwolf3 on 2017/2/23.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AutoWiringConfig.class)
//@ContextConfiguration(classes = AopConfig .class)
//@ContextConfiguration(locations = {"classpath:AopConfig.xml"})
public class AopTest {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("AopConfig.xml");
        Performance performance = (Performance) context.getBean("perform");
        performance.perform();
        performance.play(5);
    }

}
