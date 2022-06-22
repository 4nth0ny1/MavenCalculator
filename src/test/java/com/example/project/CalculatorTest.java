package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void twoPlusTwoEqualsFour(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void twoMinusTwoEqualsZero(){
        Calculator calc = new Calculator();
        assertEquals(0, calc.subtract(2, 2));
    }

    @Test
    void twoTimesThreeEqualsSix(){
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void tenDividedByTwoEqualsFive(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
    }
}