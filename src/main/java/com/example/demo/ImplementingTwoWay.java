package com.example.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ImplementingTwoWay implements MainClass {
    @Override
    public void toBeImplementedMethod() {
        System.out.println("implemented in two way");
    }
}
