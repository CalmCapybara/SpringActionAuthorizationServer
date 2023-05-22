package com.calmcapybara.springactionauthorizationserver;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringActionAuthorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringActionAuthorizationServerApplication.class, args);
    }

}
