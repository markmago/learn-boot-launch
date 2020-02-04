package com.markma.learnbootlaunch.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@author mark
@time 2020/2/4
*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    String hello(){
        return "hello spring boot";
    }

}
