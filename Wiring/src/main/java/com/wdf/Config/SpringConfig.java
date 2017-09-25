package com.wdf.Config;

import com.wdf.auto.CDPlayer;
import com.wdf.auto.CompactDisc;
import com.wdf.auto.MediaPlayer;
import com.wdf.auto.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 当使用现在方法时，两个声明可以不在一个配置文件中
 * <p>
 * Created by wdfwolf3 on 2017/2/22.
 */
@Configuration
public class SpringConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    //    @Bean
//    public MediaPlayer cdPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }
    @Bean
    public MediaPlayer cDPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
