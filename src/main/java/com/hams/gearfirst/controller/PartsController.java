package com.hams.gearfirst.controller;

import com.hams.gearfirst.entitiy.Part;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/parts")
public class PartsController {

    private final List<Part> parts = new ArrayList<>(); // 메모리에 저장

    @GetMapping
    public List<Part> getParts() {
        parts.add(new Part(1L, "엔진1", 10));
        parts.add(new Part(2L, "창문1", 15));
        parts.add(new Part(3L, "오일1", 40));
        return parts;
    }

    @PostMapping
    public Part createParts(@RequestBody Part request){
        parts.add(request);
        return request;
    }
}
