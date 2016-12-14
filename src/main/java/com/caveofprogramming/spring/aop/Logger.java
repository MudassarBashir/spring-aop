package com.caveofprogramming.spring.aop;

/**
 * Created by Moe B. on 12/13/2016.
 */
/*
In the next video, this class gets turned into a Spring Aspect which will advise the camera
class.
 */
public class Logger {

    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }
}
