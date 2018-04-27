package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 类名称：SpringBootApplicationMain<br>
 * 类描述：<br>
 * 创建时间：2018年04月26日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringBootApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}
