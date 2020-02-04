package com.markma.learnbootlaunch.Controller;

import com.markma.learnbootlaunch.model.Artical;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@author mark
@time 2020/2/4
*/
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    String hello(){
        Artical artical=new Artical(1L,"mark");
        artical.setAuthor("马克");
        artical= Artical.builder().author("markma").id(2L).build();
        log.info("artical",artical);
        return artical.toString();
    }

}
