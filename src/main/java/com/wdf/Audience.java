package com.wdf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Java方式声明通知，也可以xml方式
 * <p>
 * Created by wdfwolf3 on 2017/2/22.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.wdf.Performance.perform(..))")
    public void performance() {
    }

//    @Before("performance()")
//    public void silenceCellphone() {
//        System.out.println("Silence");
//    }
//
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("papapa");
//    };

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        System.out.println("Silence");
        System.out.println("Taking seats");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
        System.out.println("papapa");


    }
}
