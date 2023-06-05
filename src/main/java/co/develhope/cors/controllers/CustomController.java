package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @CrossOrigin()
    @GetMapping("/custom")
    public String welcome(){
        return "Welcome!";
    }



}