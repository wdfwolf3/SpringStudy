package com.wdf.auto;

import org.springframework.context.annotation.Configuration;

/**
 * 标记接口，当自动扫描的config文件写入这个接口即可扫描当前包下所有component
 */
@Configuration
public interface MarkConfig {

}
