package com.wsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jie
 */
@EnableEurekaServer
@SpringBootApplication
public class WsjRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsjRegisterApplication.class, args);
    }

}
