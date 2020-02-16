package com.ness;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration (exclude = { DataSourceAutoConfiguration.class })
//@SpringBootApplication (exclude = { DataSourceAutoConfiguration.class })

//spring boot sample code

public class Application {
    public static void main(String args[])
    {
        SpringApplication.run(Application.class,args);
    }
}
