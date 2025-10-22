package com.ruoyi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * RuoYi示例演示应用主类
 */
@SpringBootApplication
public class RuoYiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuoYiDemoApplication.class, args);
        System.out.println("RuoYi示例演示应用启动成功！");
    }

}