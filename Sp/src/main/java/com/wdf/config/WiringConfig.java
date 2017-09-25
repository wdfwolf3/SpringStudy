package com.wdf.config;

import com.wdf.auto.Config;
import com.wdf.auto.TestInterface;
import com.wdf.wiring.TestWiring;
import com.wdf.wiring.TestWiringImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Import注解可以加入其他的配置文件和xml配置文件，如下。
 * JavaConfig配置方式通过Bean注解实现自动装配，不需要Autowired
 * <p>
 * Created by wdfwolf3 on 2017/2/28.
 */
@Configuration
@Import(Config.class)
//@ImportResource({".xml",".xml"})
public class WiringConfig {
    @Bean
    public TestWiring getTestWiring(TestInterface testInterface) {
        return new TestWiringImpl(testInterface);
    }
}
