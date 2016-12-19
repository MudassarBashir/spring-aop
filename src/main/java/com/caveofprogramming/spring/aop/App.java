package com.caveofprogramming.spring.aop;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        Camera camera = (Camera)context.getBean("camera");

        try {
            camera.snap();
        } catch (Exception e) {
            log.info("Caught exception with message -> " + e.getMessage());
        }

        context.close();
    }
}
