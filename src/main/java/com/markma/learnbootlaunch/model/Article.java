package com.markma.learnbootlaunch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/*
@author mark
@time 2020/2/4
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@ApiModel("文章")
public class Article {
    @JsonIgnore
    @ApiModelProperty("id编号")
    private Long  id;
    @ApiModelProperty("作者")
    private String author;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("文章内容")
    private String content;
    //@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date createTime;
    private List<Reader> lstReader;
}
