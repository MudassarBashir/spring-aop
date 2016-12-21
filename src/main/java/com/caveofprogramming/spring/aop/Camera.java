package com.caveofprogramming.spring.aop;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Moe B. on 12/13/2016.
 */
@Component
public class Camera implements ImageryDevice, DefaultCamera {


    public Camera() {
        System.out.println("Camera constructor is constructing " + this.getClass());
    }

    public void snap() throws Exception {
        System.out.println("<***> SNAP! <***>");
    }

}
