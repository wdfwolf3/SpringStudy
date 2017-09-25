package com.wdf.wiring;

import com.wdf.auto.Config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by wdfwolf3 on 2017/2/28.
 */
@Configuration
@Import(Config.class)
@ComponentScan
public class AutoWiringConfig {

}
