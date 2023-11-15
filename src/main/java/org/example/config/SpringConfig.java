package org.example.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan("org.example")
@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

}
