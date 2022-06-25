package ru.shulpov.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        Computer pc = context.getBean("computerBean", Computer.class);

        System.out.println(pc);

        context.close();
    }
}
