package com.caveofprogramming.spring.camera.accessories;

import org.springframework.stereotype.Component;

/**
 * Created by Moe B. on 12/16/2016.
 */
@Component
public class Lens {

    public void zoom(int factor) {
        System.out.println("Zooming lens: " + factor);
    }
}
