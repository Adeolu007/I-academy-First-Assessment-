package com.JavaGuide.Java.Guide;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {


    @GetMapping("/hello")
    public String helloWord(){
        return "Hello world";
    }

    @GetMapping("/the")
    public String wordShell(){
        return "This is a new line";
    }



}
