package com.example.sum.services;

import com.example.sum.interfaces.Sum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SumService implements Sum {

    private static final Logger log = LoggerFactory.getLogger(SumService.class);

    @Override
    public Double sumNumbers(Double num1, Double num2) {
        log.debug("The numbers {} and {} are adding up", num1, num2);
        return num1 + num2;
    }
}
