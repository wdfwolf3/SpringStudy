package com.wdf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * JavaConfig方式启用切面，不声明通知为Bean的话就不会生效
 * <p>
 * Created by wdfwolf3 on 2017/2/28.
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean(name = "perform")
    public Performance getPerformance() {
        return new Perform();
    }

    @Bean
    public Audience getAudience() {
        return new Audience();
    }
}
