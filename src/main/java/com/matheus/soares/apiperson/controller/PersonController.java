package com.matheus.soares.apiperson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@ResquestMapping ("/api/v1/people")
public class PersonController {

    @GetMapping
    public String getBook()
    {
        return "teste api";
    }
}
