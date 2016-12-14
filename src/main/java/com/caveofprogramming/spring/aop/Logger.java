package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Moe B. on 12/13/2016.
 */
/*
In the next video, this class gets turned into a Spring Aspect which will advise the camera
class.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.caveofprogramming.spring.aop.Camera.snap())")
    public void cameraSnap() {

    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }
}
