package com.test.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：SpringBootApplicationMain<br>
 * 类描述：<br>
 * 创建时间：2018年04月26日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class SpringBootApplicationMain {

    @Value("${foo}")
    String foo;
//    @Value("${secret-message}")
    @Value("${messagekey}")
    String messagekey;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }


    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
