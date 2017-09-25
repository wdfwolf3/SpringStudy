package com.wdf.wiring;

import com.wdf.auto.TestInterface;
import org.springframework.stereotype.Component;

/**
 * 使用自动扫描装配时构造器加上注解Autowired（不加也能用）
 * <p>
 * Created by wdfwolf3 on 2017/2/28.
 */
@Component
public class TestWiringImpl implements TestWiring {
    private TestInterface testBean;

    //  @Autowired
    public TestWiringImpl(TestInterface testBean) {
        this.testBean = testBean;
    }

    public void play() {
        testBean.scan();
    }

}
