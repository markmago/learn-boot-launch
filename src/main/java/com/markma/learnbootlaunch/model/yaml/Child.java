package com.markma.learnbootlaunch.model.yaml;

import lombok.Data;

import java.util.List;

/*
@author mark
@time 2020/2/9
*/
@Data
public class Child {
    private String name;
    private  Integer age;
    private List<Friend> friends;
}
