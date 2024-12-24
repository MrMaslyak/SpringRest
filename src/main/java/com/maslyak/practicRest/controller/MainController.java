package com.maslyak.practicRest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maslyak.practicRest.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ObjectMapper objectMapper;


    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/cat")
    public String cat() {
        Cat cat = new Cat("Barsik", 3, 5);
        String jsonData = null;
        try {
             jsonData = objectMapper.writeValueAsString(cat);
        }catch (JsonProcessingException e ){
            System.out.println("Error with cat");
        }
        return jsonData;
    }

    @PostMapping("/catcat")
    public String giveSpecialCat(@RequestParam String name){
        Cat cat = new Cat(name, 3, 5);
        String jsonData = null;
        try {
            jsonData = objectMapper.writeValueAsString(cat);
        }catch (JsonProcessingException e ){
            System.out.println("Error with cat");
        }
        return jsonData;
    }
}
