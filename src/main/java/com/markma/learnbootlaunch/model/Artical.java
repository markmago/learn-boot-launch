package com.markma.learnbootlaunch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@author mark
@time 2020/2/4
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Artical {
    private Long id;
    private String author;

}
