package ru.shulpov.springproject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.shulpov.springproject")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
