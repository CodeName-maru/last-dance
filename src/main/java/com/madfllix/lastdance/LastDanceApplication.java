package com.madfllix.lastdance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class LastDanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LastDanceApplication.class, args);
    }

}
