package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class mytest {
    Airthmetic airthmetic=null;

    @Before
    public void setUp(){
        airthmetic=new Airthmetic();
    }
    @Test
    public void testAddition(){
        float expectedResult=10;
        float actualResult=airthmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubstract(){
        float expectedResult=1;
        float actualResult=airthmetic.substract(4,4);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide(){
        float expectedResult=1;
        float actualResult=airthmetic.divide(4,4);
        assertEquals(expectedResult,actualResult);
    }

    @After
    public void tearDown(){
        airthmetic=null;
    }
}
