package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialApiControllerTest {
    ImperialApiController i=new ImperialApiController();
    @Test
    public void gramTest(){
        double ounce=2;
    double result= i.convertToGram(ounce);
    assertEquals(56.7,result);
}
    @Test
    public void kilogramTest(){
        double stone=1;
        double result= i.convertToKilogram(stone);
        assertEquals(6.35,result);
    }
}