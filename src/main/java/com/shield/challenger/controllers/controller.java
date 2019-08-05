package com.shield.challenger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
    @GetMapping("/avengers/assemble")
    public String shield() {
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String[] directeur (){
        String[] Cities = {
        "Berlin", 
        "Bizarritz", 
        "Bordeaux", 
        "Bruxelles",
        "Bucarest", 
        "La loupe", 
        "Lille", 
        "Lisbon", 
        "Londres", 
        "Lyon", 
        "Madrid", 
        "Marseille", 
        "Nantes", 
        "Orleans", 
        "Paris",
        "Reims", 
        "Strasbourg", 
        "Toulouse", 
        "Tour" };
        
            return Cities;
    }

    
}