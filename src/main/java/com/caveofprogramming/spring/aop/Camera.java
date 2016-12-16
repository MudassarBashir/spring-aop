package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Moe B. on 12/13/2016.
 */
@Component
public class Camera {

    public void snap(int exposure) {
        System.out.println("SNAP! Exposure: " + exposure);
    }

    public void snap() {
        System.out.println("SNAP!");
    }
}
