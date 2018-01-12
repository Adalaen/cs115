package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.add(1,1));
        assertEquals(5, calculator.add(2,3));
        assertEquals(0, calculator.add(1,-1));
        assertNotEquals(-1, calculator.add(1,0));
    }

    @Test
    public void subtract() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.subtract(1,1));
        assertEquals(2, calculator.subtract(3,1));
        assertEquals(2, calculator.subtract(1,-1));
    }

    @Test
    public void multiply() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.multiply(3,0));
        assertEquals(3, calculator.multiply(3,1));
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.divide(6,3));
        assertEquals(4, calculator.divide(8,2));
        assertEquals(6, calculator.divide(36,6));
    }

}