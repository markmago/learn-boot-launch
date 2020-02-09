package com.markma.learnbootlaunch.Controller;

import com.markma.learnbootlaunch.model.AjaxResponse;
import com.markma.learnbootlaunch.model.Article;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/rest")
@Api(tags = "Article")
public class ArticleRestController {
 
    //增加一篇Article ，使用POST方法
    //@RequestMapping(value = "/article", method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value = "添加文章", notes = "添加新的文章",httpMethod = "POST")
//    @ApiResponses({
//            @ApiResponse(code=200,message="成功",response=AjaxResponse.class),
//    })
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        log.info("saveArticle：{}",article);
        return  AjaxResponse.success(article);
    }

//    /*
//    特别注意:使用postman测试时,@RequestParam注解需要将postman发送请求header里的context-type删除!!!
//     */
//    @PostMapping("/article")
//    public  AjaxResponse saveArticle(@RequestParam("id") Long id,@RequestParam String author){
//        Article article= Article.builder().author(author).id(id).build();
//        log.info("saveArticle：{}",article);
//        return  AjaxResponse.success(article);
//    }
 
    
    //删除一篇Article，使用DELETE方法，参数是id
   // @RequestMapping(value = "/article/{id}", method =RequestMethod.DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    @ApiOperation(value = "删除文章", notes = "删除某篇文章", httpMethod = "DELETE")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        log.info("deleteArticle：{}",id);
        return AjaxResponse.success(id);
    }
 
     //更新一篇Article，使用PUT方法，以id为主键进行更新
    //@RequestMapping(value = "/article/{id}", method = RequestMethod.PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    @ApiOperation(value = "更新文章", notes = "更新文章",httpMethod = "PUT")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        log.info("updateArticle：{}",article);
        return AjaxResponse.success(article);
    }
 
    //获取一篇Article，使用GET方法
    //@RequestMapping(value = "/article/{id}", method = RequestMethod.GET, produces = "application/json")
    @GetMapping("/article/{id}")
    @ApiOperation(value = "获取文章", notes = "获取某篇文章", httpMethod = "GET")
    public AjaxResponse getArticle(@PathVariable Long id) {

        //使用lombok提供的builder构建对象
        Article article1 = Article.builder()
                                .id(1L)
                                .author("zimug")
                                .content("spring boot 2.深入浅出")
                                .createTime(new Date())
                                .title("t1").build();
        return AjaxResponse.success(article1);
    }
}