package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    public void testAddNumbers(){
      Calculator calculator=new Calculator();
      int ans=calculator.addNumbers(10,20);
      assertEquals(5,ans,"Answer should be 5");
    }

}