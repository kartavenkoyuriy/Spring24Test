package com.test24spring.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan({
        "com.test24spring.web",
        "com.test24spring.db"
})
@Import({
        MvcConfig.class,
        WebSecurityConfig.class
})
public class Test24App {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Test24App.class, args);
    }
}
