package com.feifz.configclient.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/9/11 14:56
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${foo}")
    String foo;
    @RequestMapping("/hi")
    public String hi(){
        return foo;
    }
}
