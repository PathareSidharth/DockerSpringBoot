package org.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = ("org.contrller,org.serviceimplementation"))
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}