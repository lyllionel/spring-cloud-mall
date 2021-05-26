package com.lionel.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMallOrderApplication.class, args);
    }

}