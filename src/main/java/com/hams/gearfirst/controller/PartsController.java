package com.hams.gearfirst.controller;

import com.hams.gearfirst.entitiy.Part;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:5173")
public class PartsController {

    private final Set<Part> parts = new HashSet<>(); // 메모리에 저장

    @GetMapping("/")
    public void check() {
        System.out.println("********************************");
    }

    @GetMapping("/api/v1/parts")
    public Set<Part> getParts() {
        parts.add(new Part(1L, "엔진2", 10));
        parts.add(new Part(2L, "창문2", 15));
        parts.add(new Part(3L, "오일2", 40));
        return parts;
    }

    @PostMapping
    public Part createParts(@RequestBody Part request){
        parts.add(request);
        return request;
    }
}
