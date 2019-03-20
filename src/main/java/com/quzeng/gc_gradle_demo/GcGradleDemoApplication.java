package com.quzeng.gc_gradle_demo;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SwaggerDefinition
@ComponentScan(basePackages ="com.quzeng") // 扫描基础包下的配置
public class GcGradleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcGradleDemoApplication.class, args);
    }

}
