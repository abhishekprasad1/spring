package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/family")
    public List<String> retrieveData(){
        System.out.println("family method called...");
        return Arrays.asList("abhishek","gaurav","shekhar","rita");
    }

}
