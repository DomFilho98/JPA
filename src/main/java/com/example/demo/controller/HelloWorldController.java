package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping (method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok().body("hello HAAHAHAHAHAHHA");
    }

}
