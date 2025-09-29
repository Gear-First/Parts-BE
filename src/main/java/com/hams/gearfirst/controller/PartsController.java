package com.hams.gearfirst.controller;

import com.hams.gearfirst.entitiy.Part;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parts")
@CrossOrigin("http://localhost:5173")
public class PartsController {
    @GetMapping
    public List<Part> getParts() {
        List<Part> parts = List.of(
                new Part(1L, "엔진1", 10),
                new Part(2L, "창문1", 15),
                new Part(3L, "오일1", 40)
        );

        return parts;
    }
}
