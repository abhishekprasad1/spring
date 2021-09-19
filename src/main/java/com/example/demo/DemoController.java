package com.example.demo;


import com.example.ExceptionHandling.PatientNotFoundException;
import com.hospital.details.PatientDetail;
import com.hospital.details.PatientDetailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        if(service.getPatientDetail(id) == null){
            throw new PatientNotFoundException("User with Id "+id+" does not exist");
        }

        return service.getPatientDetail(id);
    }

    @PostMapping("/savepatient")
    public ResponseEntity addData(@RequestBody PatientDetail patientDetail){
        service.savePatientDetail(patientDetail);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(patientDetail.getId()).toUri();
        return ResponseEntity.created(uri).build();


    }
}
