package com.caveofprogramming.spring.aop;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(org.slf4j.Logger.class);

    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\caveofprogramming\\spring\\aop\\beans.xml");

        Object obj = context.getBean("camera");
        System.out.println("Class of obj: " + obj.getClass());
        System.out.println(obj instanceof Camera);

        DefaultCamera camera = (DefaultCamera)context.getBean("camera");

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("Caught exception with message -> " + e.getMessage());
        }

        context.close();
    }
}
