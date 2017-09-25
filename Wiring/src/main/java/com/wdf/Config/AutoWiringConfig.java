package com.wdf.Config;

import com.wdf.auto.MarkConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wdfwolf3 on 2017/2/22.
 */
@Configuration
@ComponentScan(basePackageClasses = {MarkConfig.class})
public class AutoWiringConfig {
}
