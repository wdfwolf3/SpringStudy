package com.wdf.config;

import com.wdf.auto.TestBean;
import com.wdf.auto.TestInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * JavaConfig配置方式配置文件，去掉自动扫描注解ComponentScan，直接使用Bean注解
 */
@Configuration
public class BeanConfig {
    @Bean(name = "testBean")
    public TestInterface getTestInterface() {
        return new TestBean();
    }

}
