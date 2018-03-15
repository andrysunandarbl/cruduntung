package com.untung.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by andry.sunandar01 on 15/03/2018.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.untung.demo.repository")
@EntityScan(basePackages = "com.untung.demo.model")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

