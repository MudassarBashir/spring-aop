package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
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

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(org.slf4j.Logger.class);

    // This defines where in the target we want to 'insert' advice.
    @Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap())")
    public void cameraSnap() {

    }

    // This defines that we want the advice inserted _before_ the pointcut defined above.
    @Before("cameraSnap()")
    public void beforeTakingPhoto() {
        System.out.println("Before advice...");
    }
}
