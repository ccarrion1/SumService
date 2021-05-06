package com.example.sum.controllers;

import com.example.sum.services.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sum")
public class SumController {

    @Autowired
    private SumService service;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Double sumNumbers(@RequestParam Double num1, @RequestParam Double num2) {
        return service.sumNumbers(num1, num2);
    }

}
