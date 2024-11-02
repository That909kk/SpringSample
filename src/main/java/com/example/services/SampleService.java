package com.example.services;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService {
    public int Sum(int a, int b) {
        return a + b;
    }
    public int Multiply(int a, int b) {
        return a * b;
    }
    public List<String> cuuchuong(int a) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(a + " x " + i + " = " + a * i);
        }

        return result;}
    }
