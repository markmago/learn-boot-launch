package com.markma.learnbootlaunch.model.yaml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
@author mark
@time 2020/2/9
*/
@Data
@Component
@ConfigurationProperties(prefix ="family")
public class Family {

    private Father father;
    private Mother mother;
    private Child child;
   // @Value("${family.family-name}")
    private String familyName;
}
