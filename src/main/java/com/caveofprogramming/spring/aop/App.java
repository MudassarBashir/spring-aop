package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\caveofprogramming\\spring\\aop\\beans.xml");

        Camera camera = (Camera)context.getBean("camera");
        Lens lens = (Lens)context.getBean("lens");

        camera.snap();
        camera.snap(100);
        camera.snap("Prague castle");
        camera.snapNightTime();

        lens.zoom(5);

        context.close();
    }
}
