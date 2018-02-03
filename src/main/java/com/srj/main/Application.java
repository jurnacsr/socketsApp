package com.srj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Stephen Jurnack
 * @since 1/2/2018
 */

@SpringBootApplication
@ComponentScan("com.srj")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
