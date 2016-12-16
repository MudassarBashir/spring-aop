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

    // This defines where in the target we want to 'insert' advice.
    @Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.*(..))")
    public void cameraSnap() {

    }

    @Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap(String))")
    public void cameraSnapName() {

    }

    // This defines that we want the advice inserted _before_ the pointcut defined above.
    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }

    @Before("cameraSnapName()")
    public void aboutToTakePhotoWithName() {
        System.out.println("About to take photo with name...");
    }
}
