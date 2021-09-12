package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImplementInOneWay  implements MainClass{

    @Override
    public void toBeImplementedMethod() {
        System.out.println("Impelementing in one way");
    }
}
