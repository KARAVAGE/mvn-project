package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMyFunction() {
        double result = App.myFunction(2, 2);
        assertEquals(4.0, result, 0.0);
    }
}
