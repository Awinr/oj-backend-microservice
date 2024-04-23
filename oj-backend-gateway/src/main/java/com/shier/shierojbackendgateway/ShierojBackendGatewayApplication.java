package com.shier.ojbackendgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Shier
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class ojBackendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ojBackendGatewayApplication.class, args);
    }

}
