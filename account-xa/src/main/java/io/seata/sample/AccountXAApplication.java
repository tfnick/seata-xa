package io.seata.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
public class AccountXAApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountXAApplication.class, args);
    }
}
