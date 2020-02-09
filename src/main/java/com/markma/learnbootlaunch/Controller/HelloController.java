package com.markma.learnbootlaunch.Controller;

import com.markma.learnbootlaunch.model.Article;
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
        Article article=new Article();
        article.setAuthor("马克");
        article= Article.builder().author("markma").id(2L).build();
        log.info("article",article);
        return article.toString();
    }

}
