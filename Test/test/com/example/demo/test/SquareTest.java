package com.example.demo.test;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void shouldHaveFourSides() {
        Square square = new Square();
        int numberOfSides= square.getNumberOfSides();
        Assertions.assertEquals(4,numberOfSides);
    }
}