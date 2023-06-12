package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialApiController {
    @RequestMapping("/api/gram")
    public double convertToGram(@RequestParam double ounce){
        return ounce*28.35;
    }
    @RequestMapping("/api/kilogram")
    public double convertToKilogram(double stone){
        return stone*6.35;
    }
}
