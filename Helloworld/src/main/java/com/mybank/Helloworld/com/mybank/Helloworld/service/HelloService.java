package com.mybank.Helloworld.com.mybank.Helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    private final RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getHelloMessage() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/hello", String.class);
        return responseEntity.getBody();
    }
}
