package com.example.webservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MonWebService {

    @GetMapping (value = "/bonjour")
    public String bonjour()
    { return "Bonjour";}

}
