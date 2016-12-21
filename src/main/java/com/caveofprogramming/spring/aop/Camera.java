package com.caveofprogramming.spring.aop;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Moe B. on 12/13/2016.
 */
@Component
public class Camera implements ImageryDevice {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(org.slf4j.Logger.class);

    public void snap() throws Exception {
        System.out.println("<***> SNAP! <***>");
    }

}
