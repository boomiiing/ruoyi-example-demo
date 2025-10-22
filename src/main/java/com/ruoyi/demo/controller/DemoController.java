package com.ruoyi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例控制器
 */
@RestController
public class DemoController {

    /**
     * 示例接口
     * @return 返回欢迎信息
     */
    @GetMapping("/hello")
    public String hello() {
        return "欢迎使用RuoYi示例演示项目！";
    }

    /**
     * 状态检查接口
     * @return 返回运行状态
     */
    @GetMapping("/health")
    public String health() {
        return "应用运行正常";
    }
}