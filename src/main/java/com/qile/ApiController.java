package com.qile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xing on 2017/9/1.
 */
@RestController
//@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("")
    public String hello(){
        System.out.println("test");
        return "hello";
    }
}
