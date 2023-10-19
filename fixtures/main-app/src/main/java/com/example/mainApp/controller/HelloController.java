package com.example.mainApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/hello")
public class HelloController {

    private final String SIDECAR_URL = "http://localhost:8090/api/hello";

    @GetMapping
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping(path = "/sidecar") 
    public String askSidecar() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(SIDECAR_URL, String.class);
        return responseEntity.getBody();
    }
}
