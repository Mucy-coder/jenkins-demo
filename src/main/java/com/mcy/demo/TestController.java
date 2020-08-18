package com.mcy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/index")
    public String index()
    {
        return "jenkins demo test success!----------------------王思怡是个大傻逼";
    }
}
