package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialApiController {
    @RequestMapping("/api/gram")
    public double convertToGram(double ounce){
        return ounce*28.35;
    }
}
