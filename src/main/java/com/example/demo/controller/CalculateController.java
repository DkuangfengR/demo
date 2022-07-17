package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //注意不要用@RestController,因为它返回的是json数据格式，而我们要的是htm顶面/
public class CalculateController {
    @RequestMapping("/calc")
    public String calculate() {
        return "calculate";
    }
}
