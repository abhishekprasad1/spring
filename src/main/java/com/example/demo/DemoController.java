package com.example.demo;


import com.hospital.details.PatientDetail;
import com.hospital.details.PatientDetailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private PatientDetailDAO service;

    @GetMapping("/family")
    public List<String> retrieveData(){
        System.out.println("family method called...");
        return Arrays.asList("test","gaurav","shekhar","rita");
    }

    @GetMapping("/patients")
    public List<PatientDetail> getAllData(){
        return service.getAllPatientDetails();
    }


    @GetMapping("/patient/{id}")
    public PatientDetail getData(@PathVariable int id){
        return service.getPatientDetail(id);
    }

    @PostMapping("/savepatient")
    public void addData(@RequestBody PatientDetail patientDetail){
        service.savePatientDetail(patientDetail);
    }
}
