package com.hexa.resmgt.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
 
import com.hexa.resmgt.springboot.configuration.JpaConfiguration;
 //http://websystique.com/spring-boot/spring-boot-angularjs-spring-data-jpa-crud-app-example/
 
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.hexa.resmgt.springboot"})
public class SpringBootApp {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}

