package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialApiControllerTest {
    ImperialApiController i=new ImperialApiController();
@Test
    public void gramTest(){
    i.convertToGram(2);
    assertEquals(57,i.convertToGram(2));
}
}