package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luoxu
 * @version 1.0
 * @date 2021/11/12 10:56
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekeMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekeMain7001.class,args);
    }
}
