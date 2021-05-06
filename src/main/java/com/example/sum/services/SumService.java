package com.example.sum.services;

import com.example.sum.interfaces.Sum;
import org.springframework.stereotype.Service;

@Service
public class SumService implements Sum {

    @Override
    public Double sumNumbers(Double num1, Double num2) {
        return num1 + num2;
    }
}
