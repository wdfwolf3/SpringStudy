package com.wdf.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动扫描的config文件，需要扫描的包内随便写一个类即可
 */
@Configuration
@ComponentScan(basePackageClasses = {MarkConfig.class})
public class Config {

}
