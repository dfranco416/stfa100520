package com.wozu.stfa.three.tuesday;

import com.wozu.stfa.three.tuesday.patterns.TDDExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TDExampleTest {

    TDDExample tddExample;


    @BeforeEach
    public void setUp(){
        tddExample = new TDDExample();
    }

    @Test
    public void testCount(){
        int expected = 5;
        int actual = tddExample.addOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testMulti(){
        int expected = 12;
        int actual = tddExample.multiplyThree();
        assertEquals(expected, actual);
    }
    @Test
    public void testCircumference(){
        double expected = 25.12;
        double actual = tddExample.circumference();
        assertEquals(expected, actual);
    }
    @Test
    public void testContains(){
        boolean expected = true;
        boolean actual = tddExample.stringContains();
        assertTrue(actual);
    }
}
